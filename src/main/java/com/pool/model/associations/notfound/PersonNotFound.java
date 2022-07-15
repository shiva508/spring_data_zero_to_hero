package com.pool.model.associations.notfound;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "PERSON_FOUND")
public class PersonNotFound implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PERSON_ID")
    private Long personId;
    private String personName;

    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    // @JoinColumn(name = "city_fk", referencedColumnName = "id")
    private CityNotFound cityNotFound;

    public PersonNotFound() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public CityNotFound getCityNotFound() {
        return cityNotFound;
    }

    public void setCityNotFound(CityNotFound cityNotFound) {
        this.cityNotFound = cityNotFound;
    }

}
