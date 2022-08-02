package codegym.exercise1.repository;

import codegym.exercise1.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends Repository<Message> {
}
