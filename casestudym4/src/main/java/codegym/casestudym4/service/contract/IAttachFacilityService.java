package codegym.casestudym4.service.contract;

import codegym.casestudym4.model.contract.AttachFacility;
import codegym.casestudym4.model.customer.CustomerType;

import java.util.List;

public interface IAttachFacilityService {
    List<AttachFacility> findAll();
}
