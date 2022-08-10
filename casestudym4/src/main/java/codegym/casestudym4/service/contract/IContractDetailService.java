package codegym.casestudym4.service.contract;

import codegym.casestudym4.model.contract.AttachFacility;
import codegym.casestudym4.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> findAll();

    List<ContractDetail> getContractDetail(int id);


    void remove(ContractDetail contractDetail);
}
