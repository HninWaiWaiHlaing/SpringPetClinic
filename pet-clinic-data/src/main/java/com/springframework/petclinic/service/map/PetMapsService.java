package com.springframework.petclinic.service.map;

import com.springframework.petclinic.model.Pet;
import com.springframework.petclinic.service.CrudService;
import com.springframework.petclinic.service.PetService;

import java.util.Set;

public class PetMapsService extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
