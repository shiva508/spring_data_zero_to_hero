package com.pool.service.associations.manytomany.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pool.model.associations.manytomany.bidirectional.AddressManyToManyBi;
import com.pool.repository.associations.manytomany.bidirectional.AddressManyToManyBiRepository;

@Service
public class AddressManyToManyBiServiceImpl implements AddressManyToManyBiService {
    @Autowired
    private AddressManyToManyBiRepository addressManyToManyBiRepository;

    @Override
    @Transactional
    public AddressManyToManyBi save(AddressManyToManyBi addressManyToManyUni) {
        return addressManyToManyBiRepository.save(addressManyToManyUni);
    }

    @Override
    @Transactional
    public List<AddressManyToManyBi> findAll() {
        return addressManyToManyBiRepository.findAll();
    }

    @Override
    @Transactional
    public AddressManyToManyBi findByAddressId(Long addressId) {
        return addressManyToManyBiRepository.getById(addressId);
    }

}
