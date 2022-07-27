package codegym.borrow_books.repository;

import codegym.borrow_books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
