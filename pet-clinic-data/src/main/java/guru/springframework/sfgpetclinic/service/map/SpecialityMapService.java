package guru.springframework.sfgpetclinic.service.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.service.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return findById(id);
    }
}
