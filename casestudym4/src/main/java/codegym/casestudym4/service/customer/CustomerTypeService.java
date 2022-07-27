package codegym.casestudym4.service.customer;

import codegym.casestudym4.model.customer.CustomerType;
import codegym.casestudym4.repository.customer.ICustomerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService{
    @Autowired
    ICustomerType customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
