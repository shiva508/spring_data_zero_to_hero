package com.pool.service.associations.manytomany.link;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.manytomany.link.PersonManyToManyLink;
import com.pool.repository.associations.manytomany.link.PersonManyToManyLinkRepository;

@Service
public class PersonManyToManyLinkServiceImpl implements PersonManyToManyLinkService {

    @Autowired
    private PersonManyToManyLinkRepository personManyToManyLinkRepository;

    @Override
    @Transactional
    public PersonManyToManyLink save(PersonManyToManyLink personManyToManyLink) {
        return personManyToManyLinkRepository.save(personManyToManyLink);
    }

    @Override
    @Transactional
    public List<PersonManyToManyLink> getAll() {
        return personManyToManyLinkRepository.findAll();
    }

    @Override
    @Transactional
    public PersonManyToManyLink getByPersonId(Long personId) {
        return personManyToManyLinkRepository.getById(personId);
    }

}
