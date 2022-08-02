package codegym.casestudym4.service.facility;

import codegym.casestudym4.model.facility.Facility;
import codegym.casestudym4.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return facilityRepository.findAll(pageable);
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);

    }

    @Override
    public Optional<Facility> findById(int id) {
        return facilityRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        facilityRepository.deleteById(id);
    }

    @Override
    public Page<Facility> search(String name, Pageable pageInfo) {
        return facilityRepository.findByNameContaining(name, pageInfo);
    }
}
