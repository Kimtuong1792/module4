package codegym.casestudym4.service.employee;

import codegym.casestudym4.model.customer.CustomerType;
import codegym.casestudym4.model.employee.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();
}
