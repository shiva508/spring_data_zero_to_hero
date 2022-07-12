package com.pool.model.associations.manytomany.link;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_ADDRESS_LINK")
public class PersonAddressLink implements Serializable {
    @Id
    @ManyToOne
    private PersonManyToManyLink personManyToManyLink;

    @Id
    @ManyToOne
    private AddressManyToManyLink addressManyToManyLink;

    public PersonAddressLink() {
    }

    public PersonAddressLink(PersonManyToManyLink personManyToManyLink, AddressManyToManyLink addressManyToManyLink) {
        this.personManyToManyLink = personManyToManyLink;
        this.addressManyToManyLink = addressManyToManyLink;
    }

    public PersonManyToManyLink getPersonManyToManyLink() {
        return personManyToManyLink;
    }

    public void setPersonManyToManyLink(PersonManyToManyLink personManyToManyLink) {
        this.personManyToManyLink = personManyToManyLink;
    }

    public AddressManyToManyLink getAddressManyToManyLink() {
        return addressManyToManyLink;
    }

    public void setAddressManyToManyLink(AddressManyToManyLink addressManyToManyLink) {
        this.addressManyToManyLink = addressManyToManyLink;
    }

}
