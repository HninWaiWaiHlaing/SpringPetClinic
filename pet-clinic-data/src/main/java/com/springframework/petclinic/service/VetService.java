package com.springframework.petclinic.service;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
