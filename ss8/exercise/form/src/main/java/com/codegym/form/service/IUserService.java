package com.codegym.form.service;

import com.codegym.form.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();

    void save(User user);

    Optional<User> findById(int id);
//
//    void update( User user);

//    void remove(int id);
//    Page<Blog> findByName(String name, Pageable pageable);
//    Page<Blog> findAll(Pageable pageable);
}
