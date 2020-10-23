package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Vet;
import java.util.Set;

public interface VetService {
  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
