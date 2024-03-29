package codegym.casestudym4.repository.contract;

import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {

    @Query(value = "select * from contract_detail where contract_id = :id", nativeQuery= true)
    List<ContractDetail> getContractDetail(@Param("id") Integer id);

}
