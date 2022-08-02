package codegym.exercise1.service;

import codegym.exercise1.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Role findById(Long id);

    void save(Role role);

    void remove(Long id);
}
