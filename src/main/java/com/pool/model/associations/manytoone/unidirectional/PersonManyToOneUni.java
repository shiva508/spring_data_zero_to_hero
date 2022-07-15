package com.pool.model.associations.manytoone.unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_MANY_TO_ONE_UNI")
public class PersonManyToOneUni {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long personId;

    public PersonManyToOneUni() {
    }

}
