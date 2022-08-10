package codegym.casestudym4.service.employee;

import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IEmployeeService{
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    Optional<Employee> findById(int id);

    void removeVer2(int id);

    Page<Employee> search(String name, Pageable pageInfo);

    Page<Employee> findAll2(Pageable pageable);
}
