package codegym.borrow_books.service;

import codegym.borrow_books.model.Book;
import codegym.borrow_books.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService implements IBookService {
    Book book = new Book();
    @Autowired
    IBookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        Book book1 = findById(book.getId()).get();
        if(book1.getNumber() >0){
            book1.setNumber(book1.getNumber() - 1);
            bookRepository.save(book1);
        }

    }

    @Override
    public Optional<Book> findById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void payBook(Book book) {
        Book book1 = findById(book.getId()).get();
        if(book1.getNumber()>0){
            book1.setNumber(book1.getNumber()+1);
            bookRepository.save(book1);
        }
    }

    @Override
    public Page<Book> search(String name, Pageable pageInfo) {
        return null;
    }
}
