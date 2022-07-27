package codegym.casestudym4.service.customer;

import codegym.casestudym4.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
}
