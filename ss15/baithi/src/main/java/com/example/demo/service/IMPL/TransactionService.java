package com.example.demo.service.IMPL;

import com.example.demo.model.Transaction;
import com.example.demo.repository.ITransactionRepository;
import com.example.demo.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {
    @Autowired
    ITransactionRepository transactionRepository;

    @Override
    public Page<Transaction> findAll(Pageable pageable) {
        return transactionRepository.findAll(pageable);
    }

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public Optional<Transaction> findById(String id) {
        return transactionRepository.findById(id);
    }

    @Override
    public void remove(String id) {
        transactionRepository.deleteById(id);
    }

    @Override
    public Page<Transaction> findByNameContaining(String name, String type, Pageable pageInfo) {
        if (name != "") {
            return transactionRepository.findByNameContaining(name, "%" + type + "%", pageInfo);
        }
        return transactionRepository.findByNameContaining("%" + name + "%", "%" + type + "%", pageInfo);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
}
