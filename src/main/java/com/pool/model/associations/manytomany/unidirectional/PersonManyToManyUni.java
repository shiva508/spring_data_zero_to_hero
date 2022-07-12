package com.pool.model.associations.manytomany.unidirectional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_MANY_TO_MANY_UNI")
public class PersonManyToManyUni implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PERSON_ID")
    private Long personId;

    private String personeName;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<AddressManyToManyUni> addressManyToManyUnis = new ArrayList<>();

    public PersonManyToManyUni() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public List<AddressManyToManyUni> getAddressManyToManyUnis() {
        return addressManyToManyUnis;
    }

    public void setAddressManyToManyUnis(List<AddressManyToManyUni> addressManyToManyUnis) {
        this.addressManyToManyUnis = addressManyToManyUnis;
    }

    public String getPersoneName() {
        return personeName;
    }

    public void setPersoneName(String personeName) {
        this.personeName = personeName;
    }

}
