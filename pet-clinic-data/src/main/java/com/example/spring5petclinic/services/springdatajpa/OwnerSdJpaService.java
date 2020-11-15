package com.example.spring5petclinic.services.springdatajpa;

import com.example.spring5petclinic.model.Owner;
import com.example.spring5petclinic.repositories.OwnerRepository;
import com.example.spring5petclinic.repositories.PetRepository;
import com.example.spring5petclinic.repositories.PetTypeRepository;
import com.example.spring5petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSdJpaService implements OwnerService {

  private final OwnerRepository ownerRepository;
  private final PetRepository petRepository;
  private final PetTypeRepository petTypeRepository;

  public OwnerSdJpaService(
      OwnerRepository ownerRepository,
      PetRepository petRepository,
      PetTypeRepository petTypeRepository
  ) {
    this.ownerRepository = ownerRepository;
    this.petRepository = petRepository;
    this.petTypeRepository = petTypeRepository;
  }

  @Override public Owner findByLastName(String lastName) {
    return ownerRepository.findByLastName(lastName);
  }

  @Override public Set<Owner> findAll() {
    Set<Owner> owners = new HashSet<>();
    ownerRepository.findAll().forEach(owners::add);

    return owners;
  }

  @Override public Owner findById(Long id) {
    return ownerRepository.findById(id)
        .orElse(null);
  }

  @Override public Owner save(Owner owner) {
    return ownerRepository.save(owner);
  }

  @Override public void deleteById(Long id) {
    ownerRepository.deleteById(id);
  }

  @Override public void delete(Owner owner) {
    ownerRepository.delete(owner);
  }
}
