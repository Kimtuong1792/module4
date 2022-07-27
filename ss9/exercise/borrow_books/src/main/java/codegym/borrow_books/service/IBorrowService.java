package codegym.borrow_books.service;

import codegym.borrow_books.model.Book;
import codegym.borrow_books.model.Borrow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBorrowService {
    Page<Borrow> findAll(Pageable pageable);

    void save(Borrow borrow);

    Optional<Borrow> findById(int id);

    void remove(int id);

    Page<Borrow> search(String name, Pageable pageInfo);
}
