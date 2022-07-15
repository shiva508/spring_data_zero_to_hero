package com.pool.service.associations.manytomany.link;

import java.util.List;

import com.pool.model.associations.manytomany.link.PersonManyToManyLink;

public interface PersonManyToManyLinkService {
    public PersonManyToManyLink save(PersonManyToManyLink personManyToManyLink);

    public List<PersonManyToManyLink> getAll();

    public PersonManyToManyLink getByPersonId(Long personId);
}
