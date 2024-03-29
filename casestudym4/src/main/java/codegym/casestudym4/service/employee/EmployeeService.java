package codegym.casestudym4.service.employee;

import codegym.casestudym4.model.employee.Employee;
import codegym.casestudym4.repository.employee.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save(Employee employee) {
employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void removeVer2(int id) {
        employeeRepository.removerVer2(id);
    }

    @Override
    public Page<Employee> search(String name, Pageable pageInfo) {
        return employeeRepository.findByNameContaining(name, pageInfo);
    }

    @Override
    public Page<Employee> findAll2(Pageable pageable) {
        return employeeRepository.findAll2(pageable);
    }
}
