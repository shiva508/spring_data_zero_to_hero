package com.pool.repository.associations.onetoone.unidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.pool.model.associations.onetoone.unidirectional.Faculty;

public class FacultySpecification implements Specification<Faculty> {
	private List<SearchCriteria> list;

	public FacultySpecification() {
		this.list = new ArrayList<>();
	}

	public void add(SearchCriteria criteria) {
		list.add(criteria);
	}

	@Override
	public Predicate toPredicate(Root<Faculty> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		// create a new predicate list
		List<Predicate> predicates = new ArrayList<>();

		// add add criteria to predicates
		for (SearchCriteria criteria : list) {
			if (criteria.getOperations().equals(SearchOperation.GREATER_THAN)) {
				predicates
						.add(criteriaBuilder.greaterThan(root.get(criteria.getKey()), criteria.getValue().toString()));
			} else if (criteria.getOperations().equals(SearchOperation.LESS_THAN)) {
				predicates.add(criteriaBuilder.lessThan(root.get(criteria.getKey()), criteria.getValue().toString()));
			} else if (criteria.getOperations().equals(SearchOperation.GREATER_THAN_EQUAL)) {
				predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(criteria.getKey()),
						criteria.getValue().toString()));
			} else if (criteria.getOperations().equals(SearchOperation.LESS_THAN_EQUAL)) {
				predicates.add(
						criteriaBuilder.lessThanOrEqualTo(root.get(criteria.getKey()), criteria.getValue().toString()));
			} else if (criteria.getOperations().equals(SearchOperation.NOT_EQUAL)) {
				predicates.add(criteriaBuilder.notEqual(root.get(criteria.getKey()), criteria.getValue()));
			} else if (criteria.getOperations().equals(SearchOperation.EQUAL)) {
				predicates.add(criteriaBuilder.equal(root.get(criteria.getKey()), criteria.getValue()));
			} else if (criteria.getOperations().equals(SearchOperation.MATCH)) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(criteria.getKey())),
						"%" + criteria.getValue().toString().toLowerCase() + "%"));
			} else if (criteria.getOperations().equals(SearchOperation.MATCH_END)) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(criteria.getKey())),
						criteria.getValue().toString().toLowerCase() + "%"));
			} else if (criteria.getOperations().equals(SearchOperation.MATCH_START)) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(criteria.getKey())),
						"%" + criteria.getValue().toString().toLowerCase()));
			} else if (criteria.getOperations().equals(SearchOperation.IN)) {
				predicates.add(criteriaBuilder.in(root.get(criteria.getKey())).value(criteria.getValue()));
			} else if (criteria.getOperations().equals(SearchOperation.NOT_IN)) {
				predicates.add(criteriaBuilder.not(root.get(criteria.getKey())).in(criteria.getValue()));
			}
		}

		return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
	}

}
