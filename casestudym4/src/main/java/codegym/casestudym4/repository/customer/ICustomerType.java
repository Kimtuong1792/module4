package codegym.casestudym4.repository.customer;

import codegym.casestudym4.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerType extends JpaRepository<CustomerType,Integer> {
}
