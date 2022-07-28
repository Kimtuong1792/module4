package codegym.blog2.service;

import codegym.blog2.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(int id);

   void update(int id, Blog blog);

    void remove(int id);
//    List<Blog> findByName(String name);

}
