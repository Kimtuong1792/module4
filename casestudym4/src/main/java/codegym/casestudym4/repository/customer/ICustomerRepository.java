package codegym.casestudym4.repository.customer;

import codegym.casestudym4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select * from customer where name like :search", nativeQuery= true)
    Page<Customer> findByNameContaining(@Param("search") String name, Pageable pageable);


}
