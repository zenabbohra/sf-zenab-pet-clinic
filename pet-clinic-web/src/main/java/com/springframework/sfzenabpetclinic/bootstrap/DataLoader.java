package com.springframework.sfzenabpetclinic.bootstrap;

import com.springframework.sfzenabpetclinic.model.Owner;
import com.springframework.sfzenabpetclinic.model.Vet;
import com.springframework.sfzenabpetclinic.services.OwnerService;
import com.springframework.sfzenabpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService,
      VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override public void run(String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");

    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glen");

    ownerService.save(owner2);

    System.out.println("Load Owners...");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Regina");
    vet2.setLastName("George");

    vetService.save(vet2);

    System.out.println("Load Vets....");
  }
}
