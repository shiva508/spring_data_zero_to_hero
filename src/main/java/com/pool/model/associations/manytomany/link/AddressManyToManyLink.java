package com.pool.model.associations.manytomany.link;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_LINK")
public class AddressManyToManyLink implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ADDRESS_ID")
    private Long addressId;

    private String streetName;

    private String houseNumber;

    @OneToMany(mappedBy = "addressManyToManyLink", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonAddressLink> personAddressLinks = new ArrayList<>();

    public AddressManyToManyLink() {
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

    public List<PersonAddressLink> getPersonAddressLinks() {
        return personAddressLinks;
    }

    public void setPersonAddressLinks(List<PersonAddressLink> personAddressLinks) {
        this.personAddressLinks = personAddressLinks;
    }

}
