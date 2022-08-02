package codegym.casestudym4.repository.facility;

import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = "select * from facility where name like :search", nativeQuery= true)
    Page<Facility> findByNameContaining(@Param("search") String name, Pageable pageable);
}
