package com.pool.repository.associations.onetoone.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.model.associations.onetoone.bidirectional.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
