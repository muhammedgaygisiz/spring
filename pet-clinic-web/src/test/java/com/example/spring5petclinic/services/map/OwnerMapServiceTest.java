package com.example.spring5petclinic.services.map;

import com.example.spring5petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

  public static final long OWNER_ID_1 = 1L;
  public static final long OWNER_ID_2 = 2L;
  public static final String OWNER_1_LASTNAME = "Smith";
  OwnerMapService ownerMapService;

  @BeforeEach
  void setUp() {
    ownerMapService = new OwnerMapService(
        new PetTypeMapService(),
        new PetMapService()
    );

    ownerMapService.save(Owner.builder()
        .id(OWNER_ID_1)
        .lastName(OWNER_1_LASTNAME)
        .build()
    );
  }

  @Test
  void findAll() {
    Set<Owner> ownerSet = ownerMapService.findAll();

    assertEquals(1, ownerSet.size());
  }

  @Test
  void findById() {
    Owner owner = ownerMapService.findById(OWNER_ID_1);

    assertEquals(OWNER_ID_1, owner.getId());
  }

  @Test
  void saveExistingId() {
    Owner owner2 = Owner.builder().id(OWNER_ID_2).build();

    Owner savedOwner = ownerMapService.save(owner2);

    assertEquals(OWNER_ID_2, savedOwner.getId());
  }

  @Test
  void saveNoId() {
    Owner savedOwner = ownerMapService.save(Owner.builder().build());

    assertNotNull(savedOwner);
    assertNotNull(savedOwner.getId());
  }

  @Test
  void delete() {
    ownerMapService.delete(ownerMapService.findById(OWNER_ID_1));

    assertEquals(0, ownerMapService.findAll().size());
  }

  @Test
  void deleteById() {
    ownerMapService.deleteById(OWNER_ID_1);

    assertEquals(0, ownerMapService.findAll().size());
  }

  @Test
  void findByLastName() {
    Owner owner = ownerMapService.findByLastName(OWNER_1_LASTNAME);

    assertNotNull(owner);
    assertEquals(OWNER_ID_1, owner.getId());
  }

  @Test
  void findByLastNameNotFound() {
    Owner owner = ownerMapService.findByLastName("foo");

    assertNull(owner);
  }
}