package codegym.casestudym4.service.contract;

import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    void save(Contract contract);

    Optional<Contract> findById(int id);

    void remove(int id);

    Page<Contract> search(String name, Pageable pageInfo);
    List<Double> getTotalMoney();

    List<Contract> findByCustomerId(int id);
}
