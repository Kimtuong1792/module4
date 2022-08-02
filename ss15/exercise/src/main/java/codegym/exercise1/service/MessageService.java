package codegym.exercise1.service;

import codegym.exercise1.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();

    Message findById(Long id);

    void save(Message customer);

    void remove(Long id);
}
