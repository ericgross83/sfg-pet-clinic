package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Specialty;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.SpecialtyService;
import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialities().size() > 0){
            vet.getSpecialities().forEach(specialty -> {
                if (specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
