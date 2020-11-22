package com.example.spring5petclinic.services;

import com.example.spring5petclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String anyString);
}
