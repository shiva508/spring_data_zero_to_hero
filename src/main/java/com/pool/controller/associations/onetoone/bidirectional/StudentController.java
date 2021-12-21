package com.pool.controller.associations.onetoone.bidirectional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.associations.onetoone.bidirectional.Student;
import com.pool.service.associations.onetoone.bidirectional.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/getbystudentid/{studentId}")
	public Student getStudentBySudentId(@PathVariable("studentId") Integer studentId) {
		return studentService.getStudentBySudentId(studentId);
	}

	@GetMapping("/getAllStudents")
	public List<Student> getAllStuudents() {
		return studentService.getAllStuudents();
	}

	@DeleteMapping("/deletebystudentid/{studentId}")
	public void deleteStudentByStudentId(@PathVariable("studentId") Integer studentId) {
		studentService.deleteStudentByStudentId(studentId);
	}
}
