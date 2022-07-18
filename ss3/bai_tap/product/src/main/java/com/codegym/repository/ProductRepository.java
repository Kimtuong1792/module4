package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productMap = new HashMap<>();

    static {


        productMap.put(1, new Product(1, "Samsung", 1000, "Hanoi"));
        productMap.put(2, new Product(2, "iphone", 1000, "Danang"));
        productMap.put(3, new Product(3, "Oppo", 1000, "Saigon"));
        productMap.put(4, new Product(4, "Lenovo", 1000, "Beijin"));
        productMap.put(5, new Product(5, "Vivo", 1000, "Miami"));
        productMap.put(6, new Product(6, "Readme", 1000, "Newyork"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Integer, Product> iteam : productMap.entrySet()) {
            if (iteam.getValue().getName().contains(name)) {
                productList.add(iteam.getValue());
            }
        }
        return  productList;
    }
}
