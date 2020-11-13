package com.example.spring5petclinic.repositories;

import com.example.spring5petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);
}
