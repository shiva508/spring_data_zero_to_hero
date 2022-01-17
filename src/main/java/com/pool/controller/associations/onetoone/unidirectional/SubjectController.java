package com.pool.controller.associations.onetoone.unidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.associations.onetoone.unidirectional.Subject;
import com.pool.service.associations.onetoone.unidirectional.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/save")
	public Subject saveSubject(@RequestBody Subject subject) {
		return subjectService.saveSubject(subject);
	}

	@GetMapping("/all")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
}
