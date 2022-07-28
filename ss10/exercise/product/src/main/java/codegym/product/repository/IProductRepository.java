package codegym.product.repository;

import codegym.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository  extends JpaRepository<Product, Long> {
}
