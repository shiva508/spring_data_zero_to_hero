package com.pool.controller.associations.manytomany.unidirectional;

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

import com.pool.model.associations.manytomany.unidirectional.AddressManyToManyUni;
import com.pool.model.associations.manytomany.unidirectional.PersonManyToManyUni;
import com.pool.service.associations.manytomany.unidirectional.AddressManyToManyUniService;
import com.pool.service.associations.manytomany.unidirectional.PersonManyToManyUniService;

@RestController
@RequestMapping("/api/vi/manytomanyuni")
public class ManyToManyUniController {

    @Autowired
    private PersonManyToManyUniService personManyToManyUniService;

    @Autowired
    private AddressManyToManyUniService addressManyToManyUniService;

    @PostMapping("/createperson")
    public ResponseEntity<?> savePerson(@RequestBody PersonManyToManyUni personManyToManyUni) {
        PersonManyToManyUni savedPersonManyToManyUni = personManyToManyUniService.save(personManyToManyUni);
        return new ResponseEntity<>(savedPersonManyToManyUni, HttpStatus.CREATED);
    }

    @GetMapping("/getallperson")
    public ResponseEntity<?> getAllPersons() {
        List<PersonManyToManyUni> savedPersonManyToManyUnis = personManyToManyUniService.getAll();
        return new ResponseEntity<>(savedPersonManyToManyUnis, HttpStatus.OK);
    }

    @GetMapping("/getbypersonid/{personId}")
    public ResponseEntity<?> getPersonsById(@PathVariable("personId") Long personId) {
        PersonManyToManyUni savedPersonManyToManyUni = personManyToManyUniService.getByPersonId(personId);
        return new ResponseEntity<>(savedPersonManyToManyUni, HttpStatus.OK);
    }

    @PostMapping("/createaddress")
    public ResponseEntity<?> saveAdderess(@RequestBody AddressManyToManyUni addressManyToManyUni) {
        AddressManyToManyUni savedAddressManyToManyUni = addressManyToManyUniService.save(addressManyToManyUni);
        return new ResponseEntity<>(savedAddressManyToManyUni, HttpStatus.CREATED);
    }

    @GetMapping("/getalladdress")
    public ResponseEntity<?> getAllAddress() {
        List<AddressManyToManyUni> savedAddressManyToManyUni = addressManyToManyUniService.findAll();
        return new ResponseEntity<>(savedAddressManyToManyUni, HttpStatus.OK);
    }

    @GetMapping("/getbyaddressid/{addressId}")
    public ResponseEntity<?> getAddressById(@PathVariable("addressId") Long addressId) {
        AddressManyToManyUni savedAddressManyToManyUni = addressManyToManyUniService.findByAddressId(addressId);
        return new ResponseEntity<>(savedAddressManyToManyUni, HttpStatus.OK);
    }
}