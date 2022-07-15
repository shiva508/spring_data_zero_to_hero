package com.pool.service.associations.manytomany.link;

import java.util.List;

import com.pool.model.associations.manytomany.link.AddressManyToManyLink;

public interface AddressManyToManyLinkService {
    public AddressManyToManyLink save(AddressManyToManyLink addressManyToManyLink);

    public List<AddressManyToManyLink> findAll();

    public AddressManyToManyLink findByAddressId(Long addressId);
}
