package com.pool.repository.associations.onetoone.unidirectional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pool.model.associations.onetoone.unidirectional.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
