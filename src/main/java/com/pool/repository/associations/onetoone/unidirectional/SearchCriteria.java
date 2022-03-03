package com.pool.repository.associations.onetoone.unidirectional;

public class SearchCriteria {
	private String key;
	private Object value;
	SearchOperation operations;

	public SearchCriteria(String key, Object value, SearchOperation operations) {
		super();
		this.key = key;
		this.value = value;
		this.operations = operations;
	}

	public SearchCriteria() {

	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SearchOperation getOperations() {
		return operations;
	}

	public void setOperations(SearchOperation operations) {
		this.operations = operations;
	}

}
