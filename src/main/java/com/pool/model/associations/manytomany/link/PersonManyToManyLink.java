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

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "PERSON_LINK")
public class PersonManyToManyLink implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PERSON_ID")
    private Long personId;

    private String personeName;

    @NaturalId
    private String registrationNumber;

    @OneToMany(mappedBy = "personManyToManyLink", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonAddressLink> personAddressLinks = new ArrayList<>();

    public PersonManyToManyLink() {
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

    public List<PersonAddressLink> getPersonAddressLinks() {
        return personAddressLinks;
    }

    public void setPersonAddressLinks(List<PersonAddressLink> personAddressLinks) {
        this.personAddressLinks = personAddressLinks;
    }

    public void addAddress(AddressManyToManyLink addressManyToManyLink) {
        PersonAddressLink personAddressLink = new PersonAddressLink(this, addressManyToManyLink);
        personAddressLinks.add(personAddressLink);
        addressManyToManyLink.getPersonAddressLinks().add(personAddressLink);
    }

    public void removeAddress(AddressManyToManyLink addressManyToManyLink) {
        PersonAddressLink personAddressLink = new PersonAddressLink(this, addressManyToManyLink);
        addressManyToManyLink.getPersonAddressLinks().remove(personAddressLink);
        personAddressLinks.remove(personAddressLink);
        personAddressLink.setAddressManyToManyLink(null);
        personAddressLink.setPersonManyToManyLink(null);
    }

}
