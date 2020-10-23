package com.springframework.sfzenabpetclinic.services;

import com.springframework.sfzenabpetclinic.model.Owner;

public interface OwnerService extends CurdService<Owner, Long> {
  Owner findByLastName(String lastName);
}
