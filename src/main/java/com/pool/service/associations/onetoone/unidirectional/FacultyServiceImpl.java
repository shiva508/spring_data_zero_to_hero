package com.pool.service.associations.onetoone.unidirectional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pool.model.associations.onetoone.unidirectional.Faculty;
import com.pool.repository.associations.onetoone.unidirectional.FacultyRepository;

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
	
	
}
