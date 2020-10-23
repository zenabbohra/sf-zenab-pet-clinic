package com.springframework.sfzenabpetclinic.model;

public class PetType extends BaseEntity {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
