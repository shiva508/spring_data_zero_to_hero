package com.pool.service.associations.onetoone.unidirectional;

import java.util.List;

import com.pool.model.associations.onetoone.unidirectional.Subject;

public interface SubjectService {
	public Subject saveSubject(Subject subject);

	public List<Subject> getAllSubjects();
}
