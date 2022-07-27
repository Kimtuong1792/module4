package codegym.borrow_books.controller;

import codegym.borrow_books.model.Book;
import codegym.borrow_books.model.Borrow;
import codegym.borrow_books.service.IBookService;
import codegym.borrow_books.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    IBookService bookService;
    @Autowired
    IBorrowService borrowService;

    @GetMapping("")
    public String home(@PageableDefault(value = 3) Pageable pageable, Model model) {
        Page<Book> bookList = bookService.findAll(pageable);
        model.addAttribute("bookList", bookList);
        return "index";

    }

    @GetMapping("/{id}/borrow")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("borrow", new Borrow());
        return "borrow";
    }

    @PostMapping("/update")
    public String borrowBook(@PageableDefault(value = 3) Pageable pageable, Book book, Borrow borrow, Model model) {
        bookService.save(book);
        borrow.setBook(book);
        borrowService.save(borrow);
        Page<Book> bookList = bookService.findAll(pageable);
        model.addAttribute("bookList", bookList);
        return "index";
    }
}
