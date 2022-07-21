package codegym.repository;


import codegym.model.Product;
import javafx.beans.binding.MapExpression;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;


@Repository
@Transactional
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public ProductRepository() {

    }
    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager
                .createQuery("SELECT s FROM Product as s", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class,id);
    }

    @Override
    public void update(int id, Product product) {
        entityManager.merge(product);
    }

    @Override
    public void remove(int id) {
        entityManager.merge(entityManager.merge(id));
    }

    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query = entityManager.createQuery(
                "select m from Product as m where m.name like ?1", Product.class);
        return query.setParameter(1, name).getResultList();
    }
}
