package codegym.casestudym4.service.contract;

import codegym.casestudym4.model.contract.AttachFacility;
import codegym.casestudym4.repository.contract.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttachFacilityService implements IAttachFacilityService{
    @Autowired
   private IAttachFacilityRepository attachFacilityRepository;
    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }
}
