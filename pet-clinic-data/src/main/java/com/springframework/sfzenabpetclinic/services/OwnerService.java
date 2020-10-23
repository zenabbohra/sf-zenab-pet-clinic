package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}
