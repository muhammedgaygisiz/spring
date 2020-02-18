package com.example.spring5webapp.services;

import com.example.spring5webapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
