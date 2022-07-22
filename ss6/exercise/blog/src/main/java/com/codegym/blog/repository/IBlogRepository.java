package com.codegym.blog.repository;

import com.codegym.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Modifying
    @Query(value = "update  Blog  set status = :status," + " type = :type," + " day=:day where id = :id", nativeQuery = true)
    void update(@Param("status") String status, @Param("type") String type, @Param("day") String commit, @Param("id") int id );


    @Query(value = "select * from Blog where status like :status", nativeQuery = true)
    Page<Blog> findByName(@Param("status") String status,Pageable pageable);

    Page<Blog> findAll(Pageable pageable);


}
