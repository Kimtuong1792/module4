package codegym.blog2.service;

import codegym.blog2.model.Blog;
import codegym.blog2.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();


    void save(Category category);

    Category findById(int id);

    void update(int id, Category category);

    void remove(int id);
}
