package com.pool.service.associations.onetoone.unidirectional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pool.model.associations.onetoone.unidirectional.Faculty;
import com.pool.repository.associations.onetoone.unidirectional.FacultyRepository;
import com.pool.repository.associations.onetoone.unidirectional.FacultySpecification;
import com.pool.repository.associations.onetoone.unidirectional.SearchCriteria;
import com.pool.repository.associations.onetoone.unidirectional.SearchOperation;
import org.springframework.data.domain.Sort;

@Service
public class FacultyServiceImpl implements FacultyService{
	@Autowired
	private FacultyRepository facultyRepository;

	@Transactional
	@Override
	public Faculty saveFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	@Transactional
	@Override
	public List<Faculty> getAllFaculty() {
		return facultyRepository.findAll();
	}
	
	
	public void jpaSpecification() {

		FacultySpecification facultySpecification=new FacultySpecification();
		facultySpecification.add(new SearchCriteria("genre", "Action", SearchOperation.EQUAL));
		facultySpecification.add(new SearchCriteria("title", "black", SearchOperation.MATCH));
		facultySpecification.add(new SearchCriteria("rating", 7, SearchOperation.GREATER_THAN));
		facultySpecification.add(new SearchCriteria("releaseYear", 2010, SearchOperation.LESS_THAN));
		facultySpecification.add(new SearchCriteria("rating", 8, SearchOperation.GREATER_THAN));
		facultySpecification.add(new SearchCriteria("watchTime", 150, SearchOperation.GREATER_THAN_EQUAL));
		facultySpecification.add(new SearchCriteria("title", "white", SearchOperation.NOT_EQUAL));
		PageRequest pageable = PageRequest.of(0, 3, Sort.by("releaseYear").descending());

		facultyRepository.findAll(facultySpecification, pageable);
	}
	
}
