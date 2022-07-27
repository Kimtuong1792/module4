package codegym.casestudym4.service.employee;

import codegym.casestudym4.model.customer.CustomerType;
import codegym.casestudym4.model.employee.Division;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
}
