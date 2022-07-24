package codegym.product3.repository;

import codegym.product3.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByNameContainsOrProduceContains(String name, String produce, Pageable pageInfo);
}
