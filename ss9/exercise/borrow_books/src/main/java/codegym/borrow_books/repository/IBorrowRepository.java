package codegym.borrow_books.repository;

import codegym.borrow_books.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowRepository extends JpaRepository<Borrow,Integer> {
}
