package codegym.casestudym4.repository.employee;

import codegym.casestudym4.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
