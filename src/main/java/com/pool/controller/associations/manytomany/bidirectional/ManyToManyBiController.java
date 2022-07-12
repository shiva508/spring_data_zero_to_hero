package com.pool.controller.associations.manytomany.bidirectional;

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

import com.pool.model.associations.manytomany.bidirectional.AddressManyToManyBi;
import com.pool.model.associations.manytomany.bidirectional.PersonManyToManyBi;
import com.pool.service.associations.manytomany.bidirectional.AddressManyToManyBiService;
import com.pool.service.associations.manytomany.bidirectional.PersonManyToManyBiService;

@RestController
@RequestMapping("/api/vi/manytomanybi")
public class ManyToManyBiController {

    @Autowired
    private PersonManyToManyBiService personManyToManyBiService;

    @Autowired
    private AddressManyToManyBiService addressManyToManyBiService;

    @PostMapping("/createperson")
    public ResponseEntity<?> savePerson(@RequestBody PersonManyToManyBi personManyToManyBi) {
        PersonManyToManyBi savedPersonManyToManyBi = personManyToManyBiService.save(personManyToManyBi);
        return new ResponseEntity<>(savedPersonManyToManyBi, HttpStatus.CREATED);
    }

    @GetMapping("/getallperson")
    public ResponseEntity<?> getAllPersons() {
        List<PersonManyToManyBi> savedPersonManyToManyUnis = personManyToManyBiService.getAll();
        return new ResponseEntity<>(savedPersonManyToManyUnis, HttpStatus.OK);
    }

    @GetMapping("/getbypersonid/{personId}")
    public ResponseEntity<?> getPersonsById(@PathVariable("personId") Long personId) {
        PersonManyToManyBi savedPersonManyToManyBi = personManyToManyBiService.getByPersonId(personId);
        return new ResponseEntity<>(savedPersonManyToManyBi, HttpStatus.OK);
    }

    @PostMapping("/createaddress")
    public ResponseEntity<?> saveAdderess(@RequestBody AddressManyToManyBi addressManyToManyBi) {
        AddressManyToManyBi savedAddressManyToManyBi = addressManyToManyBiService.save(addressManyToManyBi);
        return new ResponseEntity<>(savedAddressManyToManyBi, HttpStatus.CREATED);
    }

    @GetMapping("/getalladdress")
    public ResponseEntity<?> getAllAddress() {
        List<AddressManyToManyBi> savedAddressManyToManyBi = addressManyToManyBiService.findAll();
        return new ResponseEntity<>(savedAddressManyToManyBi, HttpStatus.OK);
    }

    @GetMapping("/getbyaddressid/{addressId}")
    public ResponseEntity<?> getAddressById(@PathVariable("addressId") Long addressId) {
        AddressManyToManyBi savedAddressManyToManyBi = addressManyToManyBiService.findByAddressId(addressId);
        return new ResponseEntity<>(savedAddressManyToManyBi, HttpStatus.OK);
    }
}
