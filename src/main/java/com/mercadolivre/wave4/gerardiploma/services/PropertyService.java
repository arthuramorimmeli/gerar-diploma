package com.mercadolivre.wave4.gerardiploma.services;

import com.mercadolivre.wave4.gerardiploma.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

}
