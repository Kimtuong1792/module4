package codegym.casestudym4.repository.employee;

import codegym.casestudym4.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {
}
