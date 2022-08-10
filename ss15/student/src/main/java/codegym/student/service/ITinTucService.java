package codegym.student.service;

import codegym.student.model.TinTuc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ITinTucService {
    Page<TinTuc> findAll(Pageable pageable);

    void save(TinTuc question);

    Optional<TinTuc> findById(int id);

    void remove(int id);

    Page<TinTuc> findByNameContaining(String name, String title, Pageable pageInfo);

}
