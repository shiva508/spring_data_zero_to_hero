package com.pool.controller.associations.manytomany.link;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.associations.manytomany.link.AddressManyToManyLink;
import com.pool.model.associations.manytomany.link.PersonManyToManyLink;
import com.pool.service.associations.manytomany.link.AddressManyToManyLinkService;
import com.pool.service.associations.manytomany.link.PersonManyToManyLinkService;

@RestController
@RequestMapping("/api/vi/manytomanylink")
public class ManyToManyLinkController {
    @Autowired
    private PersonManyToManyLinkService personManyToManyLinkService;

    @Autowired
    private AddressManyToManyLinkService addressManyToManyLinkService;

    @PostMapping("/createperson")
    public ResponseEntity<?> savePerson(@RequestBody PersonManyToManyLink personManyToManyLink) {
        PersonManyToManyLink savedPersonManyToManyLink = personManyToManyLinkService.save(personManyToManyLink);
        return new ResponseEntity<>(savedPersonManyToManyLink, HttpStatus.CREATED);
    }

    @GetMapping("/getallperson")
    public ResponseEntity<?> getAllPersons() {
        List<PersonManyToManyLink> savedPersonManyToManyLinks = personManyToManyLinkService.getAll();
        return new ResponseEntity<>(savedPersonManyToManyLinks, HttpStatus.OK);
    }

    @GetMapping("/getbypersonid/{personId}")
    public ResponseEntity<?> getPersonsById(@PathVariable("personId") Long personId) {
        PersonManyToManyLink savedPersonManyToManyLink = personManyToManyLinkService.getByPersonId(personId);
        return new ResponseEntity<>(savedPersonManyToManyLink, HttpStatus.OK);
    }

    @PostMapping("/createaddress")
    public ResponseEntity<?> saveAdderess(@RequestBody AddressManyToManyLink addressManyToManyLink) {
        AddressManyToManyLink savedAddressManyToManyLink = addressManyToManyLinkService.save(addressManyToManyLink);
        return new ResponseEntity<>(savedAddressManyToManyLink, HttpStatus.CREATED);
    }

    @GetMapping("/getalladdress")
    public ResponseEntity<?> getAllAddress() {
        List<AddressManyToManyLink> savedAddressManyToManyLinks = addressManyToManyLinkService.findAll();
        return new ResponseEntity<>(savedAddressManyToManyLinks, HttpStatus.OK);
    }

    @GetMapping("/getbyaddressid/{addressId}")
    public ResponseEntity<?> getAddressById(@PathVariable("addressId") Long addressId) {
        AddressManyToManyLink savedAddressManyToManyLink = addressManyToManyLinkService.findByAddressId(addressId);
        return new ResponseEntity<>(savedAddressManyToManyLink, HttpStatus.OK);
    }

}
