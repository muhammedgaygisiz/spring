package com.example.spring5petclinic.services;

import com.example.spring5petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
