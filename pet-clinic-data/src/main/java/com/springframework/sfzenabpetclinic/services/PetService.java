package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
