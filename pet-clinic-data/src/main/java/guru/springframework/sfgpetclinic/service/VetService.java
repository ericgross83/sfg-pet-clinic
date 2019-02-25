package guru.springframework.sfgpetclinic.service;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long ownerId);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
