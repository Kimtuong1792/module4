package codegym.casestudym4.repository.contract;

import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = "select * from contract where name like :search", nativeQuery= true)
    Page<Contract> findByNameContaining(@Param("search") String name, Pageable pageable);
}
