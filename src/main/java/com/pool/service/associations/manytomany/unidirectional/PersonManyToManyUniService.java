package com.pool.service.associations.manytomany.unidirectional;

import java.util.List;

import com.pool.model.associations.manytomany.unidirectional.PersonManyToManyUni;

public interface PersonManyToManyUniService {
    public PersonManyToManyUni save(PersonManyToManyUni personManyToManyUni);

    public List<PersonManyToManyUni> getAll();

    public PersonManyToManyUni getByPersonId(Long personId);
}
