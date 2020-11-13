package com.example.spring5petclinic.services.springdatajpa;

import com.example.spring5petclinic.model.Vet;
import com.example.spring5petclinic.repositories.VetRepository;
import com.example.spring5petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSdJpaService implements VetService {

  private final VetRepository vetRepository;

  public VetSdJpaService(VetRepository vetRepository) {
    this.vetRepository = vetRepository;
  }

  @Override public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    vetRepository.findAll().forEach(vets::add);

    return vets;
  }

  @Override public Vet findById(Long id) {
    return vetRepository.findById(id).orElse(null);
  }

  @Override public Vet save(Vet vet) {
    return vetRepository.save(vet);
  }

  @Override public void deleteById(Long id) {
    vetRepository.deleteById(id);
  }

  @Override public void delete(Vet vet) {
    vetRepository.delete(vet);
  }
}
