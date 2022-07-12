package com.pool.model.associations.manytomany.bidirectional;

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

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "PERSON_MANY_TO_MANY_BI")
public class PersonManyToManyBi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PERSON_ID")
    private Long personId;

    private String personeName;

    @NaturalId
    private String registrationNumber;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<AddressManyToManyBi> addressManyToManyBis = new ArrayList<>();

    public PersonManyToManyBi() {
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersoneName() {
        return personeName;
    }

    public void setPersoneName(String personeName) {
        this.personeName = personeName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<AddressManyToManyBi> getAddressManyToManyBis() {
        return addressManyToManyBis;
    }

    public void setAddressManyToManyBis(List<AddressManyToManyBi> addressManyToManyBis) {
        this.addressManyToManyBis = addressManyToManyBis;
    }

    public void addAddress(AddressManyToManyBi addressManyToManyBi) {
        addressManyToManyBis.add(addressManyToManyBi);
        addressManyToManyBi.getPersonManyToManyBis().add(this);
    }

    public void removeAddress(AddressManyToManyBi addressManyToManyBi) {
        addressManyToManyBis.remove(addressManyToManyBi);
        addressManyToManyBi.getPersonManyToManyBis().remove(this);
    }

}
