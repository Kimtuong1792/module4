package codegym.casestudym4.repository.facility;

import codegym.casestudym4.model.facility.FacilityType;
import codegym.casestudym4.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
}
