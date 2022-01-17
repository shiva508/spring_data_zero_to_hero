package com.pool.controller.associations.onetoone.unidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pool.model.associations.onetoone.unidirectional.Faculty;
import com.pool.service.associations.onetoone.unidirectional.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	private FacultyService facultyService;

	@PostMapping("/save")
	public Faculty saveFaculty(@RequestBody Faculty faculty) {
		return facultyService.saveFaculty(faculty);
	}

	@GetMapping("/all")
	public List<Faculty> getAllFaculty() {
		return facultyService.getAllFaculty();
	}
}
