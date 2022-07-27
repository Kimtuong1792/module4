package codegym.borrow_books.service;

import codegym.borrow_books.model.Borrow;
import codegym.borrow_books.repository.IBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BorrowService implements IBorrowService {
    Borrow borrow = new Borrow();
    @Autowired
    IBorrowRepository borrowRepository;

    @Override
    public Page<Borrow> findAll(Pageable pageable) {
        return borrowRepository.findAll(pageable);
    }

    @Override
    public void save(Borrow borrow) {
        int idRandom = (int) (Math.floor(Math.random() * 10000) + 99999);
        borrow.setCode(idRandom);
        borrowRepository.save(borrow);
    }

    @Override
    public Optional<Borrow> findById(int id) {
        return borrowRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        borrowRepository.deleteById(id);
    }

    @Override
    public Borrow findByCode(Long code) {
        return borrowRepository.findByCode(code);
    }

    @Override
    public void delete(Long code) {
        borrowRepository.deleteByCode(code);
    }

    @Override
    public Page<Borrow> search(String name, Pageable pageInfo) {
        return null;
    }
}
