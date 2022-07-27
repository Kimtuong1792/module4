package codegym.casestudym4.service.employee;

import codegym.casestudym4.model.customer.CustomerType;
import codegym.casestudym4.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
