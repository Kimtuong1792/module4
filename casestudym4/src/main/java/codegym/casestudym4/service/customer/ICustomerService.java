package codegym.casestudym4.service.customer;

import codegym.casestudym4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    Optional<Customer> findById(int id);

    void remove(int id);

    Page<Customer> search(String name, Pageable pageInfo);
}
