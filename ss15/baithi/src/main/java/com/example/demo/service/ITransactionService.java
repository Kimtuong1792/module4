package com.example.demo.service;

import com.example.demo.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ITransactionService {
    Page<Transaction> findAll(Pageable pageable);

    void save(Transaction transaction);

    Optional<Transaction> findById(String id);

    void remove(String id);

    Page<Transaction> findByNameContaining(String name, String type, Pageable pageInfo);
    List<Transaction> findAll();
}
