package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Owner;
import java.util.Set;

public interface OwnerServices {
  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();
}
