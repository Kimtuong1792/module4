package codegym.borrow_books.service;

import codegym.borrow_books.model.Book;
import codegym.borrow_books.model.Borrow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    Optional<Book> findById(int id);

    void remove(int id);

    Page<Book> search(String name, Pageable pageInfo);
}
