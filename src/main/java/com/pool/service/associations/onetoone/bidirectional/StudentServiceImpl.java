package com.pool.service.associations.onetoone.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.onetoone.bidirectional.BioData;
import com.pool.model.associations.onetoone.bidirectional.Student;
import com.pool.repository.associations.onetoone.bidirectional.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public Student saveStudent(Student student) {

		if (null != student.getBioData()) {
			student.getBioData().setStudent(student);
		}
		return studentRepository.save(student);
	}

	@Override
	@Transactional
	public Student updateStudent(Student student) {
		if (null != student.getBioData()) {
			student.getBioData().setStudent(student);
		}
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentBySudentId(Integer studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	@Transactional
	public List<Student> getAllStuudents() {
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public void deleteStudentByStudentId(Integer studentId) {
		studentRepository.deleteById(studentId);
	}

}
