package com.pool.model.associations.manytomany.bidirectional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ADDRESS_MANY_TO_MANY_BI")
public class AddressManyToManyBi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ADDRESS_ID")
    private Long addressId;

    private String streetName;

    private String houseNumber;

    @ManyToMany(mappedBy = "addressManyToManyBis")
    @JsonIgnore
    private List<PersonManyToManyBi> personManyToManyBis = new ArrayList<>();

    public AddressManyToManyBi() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public List<PersonManyToManyBi> getPersonManyToManyBis() {
        return personManyToManyBis;
    }

    public void setPersonManyToManyBis(List<PersonManyToManyBi> personManyToManyBis) {
        this.personManyToManyBis = personManyToManyBis;
    }

}
