package codegym.exercise1.repository;

import codegym.exercise1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<User,Integer > {
    Optional<User> findByEmail(String email);
}
