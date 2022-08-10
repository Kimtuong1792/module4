package codegym.casestudym4.repository.security;

import codegym.casestudym4.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUserName(String name);
}
