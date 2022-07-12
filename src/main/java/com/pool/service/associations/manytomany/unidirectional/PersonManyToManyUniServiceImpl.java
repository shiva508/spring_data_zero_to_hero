package com.pool.service.associations.manytomany.unidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.manytomany.unidirectional.PersonManyToManyUni;
import com.pool.repository.associations.manytomany.unidirectional.PersonManyToManyUniRepository;

@Service
public class PersonManyToManyUniServiceImpl implements PersonManyToManyUniService {

    @Autowired
    private PersonManyToManyUniRepository personManyToManyUniRepository;

    @Override
    @Transactional
    public PersonManyToManyUni save(PersonManyToManyUni personManyToManyUni) {

        return personManyToManyUniRepository.save(personManyToManyUni);
    }

    @Override
    @Transactional
    public List<PersonManyToManyUni> getAll() {

        return personManyToManyUniRepository.findAll();
    }

    @Override
    @Transactional
    public PersonManyToManyUni getByPersonId(Long personId) {
        return personManyToManyUniRepository.getById(personId);
    }

}
