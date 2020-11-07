package com.example.spring5petclinic.services.map;

import com.example.spring5petclinic.model.PetType;
import com.example.spring5petclinic.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService
        extends AbstractMapService<PetType, Long>
        implements CrudService<PetType, Long> {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
