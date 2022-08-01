package codegym.smartphone.repository;

import codegym.smartphone.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
