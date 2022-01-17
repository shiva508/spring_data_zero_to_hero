package com.pool.service.associations.onetoone.unidirectional;

import java.util.List;

import com.pool.model.associations.onetoone.unidirectional.Faculty;

public interface FacultyService {
	
	public Faculty saveFaculty(Faculty faculty);

	public List<Faculty> getAllFaculty();
}
