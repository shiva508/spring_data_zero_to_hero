package com.pool.service.associations.manytomany.unidirectional;

import java.util.List;

import com.pool.model.associations.manytomany.unidirectional.AddressManyToManyUni;

public interface AddressManyToManyUniService {
    public AddressManyToManyUni save(AddressManyToManyUni addressManyToManyUni);

    public List<AddressManyToManyUni> findAll();

    public AddressManyToManyUni findByAddressId(Long addressId);
}
