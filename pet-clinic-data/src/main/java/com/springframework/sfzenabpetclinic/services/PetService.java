package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

}
