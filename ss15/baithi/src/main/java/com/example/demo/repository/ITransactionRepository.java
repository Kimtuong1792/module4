package com.example.demo.repository;

import com.example.demo.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ITransactionRepository extends JpaRepository<Transaction,String> {
    @Query(value="select `transaction`.* from `transaction` " +
            " left join customer on transaction.customer_id = customer.id where customer.name like :search and `transaction`.type like :typeSearch",
            countQuery = "SELECT count(*) FROM `transaction` left join customer on `transaction`.customer_id = customer.id where customer.name like :search and `transaction`.type like :typeSearch"
            ,nativeQuery = true)
    Page<Transaction> findByNameContaining(@Param("search")String search, @Param("typeSearch") String typeSearch, Pageable pageable);
}
