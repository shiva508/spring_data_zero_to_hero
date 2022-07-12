package com.pool.service.associations.manytomany.unidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.manytomany.unidirectional.AddressManyToManyUni;
import com.pool.repository.associations.manytomany.unidirectional.AddressManyToManyUniRepository;

@Service
public class AddressManyToManyUniServiceImpl implements AddressManyToManyUniService {

    @Autowired
    private AddressManyToManyUniRepository addressManyToManyUniRepository;

    @Override
    @Transactional
    public AddressManyToManyUni save(AddressManyToManyUni addressManyToManyUni) {
        return addressManyToManyUniRepository.save(addressManyToManyUni);
    }

    @Override
    @Transactional
    public List<AddressManyToManyUni> findAll() {
        return addressManyToManyUniRepository.findAll();
    }

    @Override
    @Transactional
    public AddressManyToManyUni findByAddressId(Long addressId) {
        return addressManyToManyUniRepository.getById(addressId);
    }

}
