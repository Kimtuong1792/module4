package codegym.casestudym4.repository.employee;

import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employee where name like :search", nativeQuery= true)
    Page<Employee> findByNameContaining(@Param("search") String name, Pageable pageable);
}
