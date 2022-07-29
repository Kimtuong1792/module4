package codegym.blog2.controller;

import codegym.blog2.model.Blog;
import codegym.blog2.model.Category;
import codegym.blog2.service.IBlogService;
import codegym.blog2.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog/api/v1")
@CrossOrigin
public class BlogRestController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IBlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogList() {
        List<Blog> blogListb = blogService.findAll();
        if (blogListb.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogListb, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        Blog blog1 = new Blog();
        BeanUtils.copyProperties(blog, blog1);
        blogService.save(blog1);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id, @RequestBody Blog blog) {
        Blog blog1 = blogService.findById(id);
        if (blog1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blog1.setStatus(blog.getStatus());
        blog1.setType(blog.getDay());
        blog1.setType(blog.getType());
        blog1.setCategory(blog.getCategory());
        blogService.save(blog1);
        return new ResponseEntity<>(blog1, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Blog>> search(@RequestParam("search") String search) {
        List<Blog> blogList = blogService.findByNameContaining(search);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
