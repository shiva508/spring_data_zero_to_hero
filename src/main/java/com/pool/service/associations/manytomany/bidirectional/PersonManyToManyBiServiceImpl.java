package com.pool.service.associations.manytomany.bidirectional;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.manytomany.bidirectional.AddressManyToManyBi;
import com.pool.model.associations.manytomany.bidirectional.PersonManyToManyBi;
import com.pool.repository.associations.manytomany.bidirectional.PersonManyToManyBiRepository;

@Service
public class PersonManyToManyBiServiceImpl implements PersonManyToManyBiService {

    @Autowired
    private PersonManyToManyBiRepository personManyToManyBiRepository;

    @Override
    @Transactional
    public PersonManyToManyBi save(PersonManyToManyBi personManyToManyBi) {
        List<AddressManyToManyBi> addressManyToManyBis = new ArrayList<>(personManyToManyBi.getAddressManyToManyBis());

        personManyToManyBi.getAddressManyToManyBis().clear();
        addressManyToManyBis.stream().forEach(data -> {
            personManyToManyBi.addAddress(data);
        });
        return personManyToManyBiRepository.save(personManyToManyBi);
    }

    @Override
    @Transactional
    public List<PersonManyToManyBi> getAll() {

        return personManyToManyBiRepository.findAll();
    }

    @Override
    @Transactional
    public PersonManyToManyBi getByPersonId(Long personId) {
        return personManyToManyBiRepository.getById(personId);
    }
}
