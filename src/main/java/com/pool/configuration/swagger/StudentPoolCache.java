package com.pool.configuration.swagger;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.pool.model.associations.onetoone.unidirectional.Faculty;

@Component
@Scope("singleton")
public class StudentPoolCache {
	
	Queue<Faculty> faculties = null;

	public Queue<Faculty> facultyCache() {
		if (faculties == null) {
			faculties = new LinkedList<>();
		}
		return faculties;
	}

}
