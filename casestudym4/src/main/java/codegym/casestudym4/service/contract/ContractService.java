package codegym.casestudym4.service.contract;

import codegym.casestudym4.model.contract.AttachFacility;
import codegym.casestudym4.model.contract.Contract;
import codegym.casestudym4.model.contract.ContractDetail;
import codegym.casestudym4.model.facility.Facility;
import codegym.casestudym4.repository.contract.IContractRepository;
import codegym.casestudym4.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository contractRepository;
    @Autowired
    private IContractDetailService contractDetailService;
    @Autowired
    private IAttachFacilityService attachFacilityService;
    @Autowired
    private IFacilityService facilityService;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public Optional<Contract> findById(int id) {
        return contractRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> search(String name, Pageable pageInfo) {
        return null;
    }

    @Override
    public List<Double> getTotalMoney() {
        List<Double> totalMoneyList = new ArrayList<>();
        List<Contract> contractList = contractRepository.findAll();
        List<ContractDetail> contractDetailList = contractDetailService.findAll();
        List<AttachFacility> attachFacilityList = attachFacilityService.findAll();
        List<Facility> facilityList = facilityService.findAll();
        double totalMoney = 0;

        for (int i = 0; i < contractList.size(); i++) {
            for (int j = 0; j < contractDetailList.size(); j++) {
                for (int k = 0; k < attachFacilityList.size(); k++) {

                        if (contractList.get(i).getId() == contractDetailList.get(j).getContract().getId()
                                && contractDetailList.get(j).getAttachFacility().getId() == attachFacilityList.get(k).getId()) {
                            totalMoney = totalMoney + (contractDetailList.get(j).getQuantity() * attachFacilityList.get(k).getCost()) ;

                    }
                }
            }

            totalMoneyList.add(totalMoney - contractList.get(i).getDeposit() + contractList.get(i).getFacility().getCost());
            totalMoney = 0;
        }


        return totalMoneyList;
    }

    @Override
    public List<Contract> findByCustomerId(int id) {
        return contractRepository.findByCustomerId(id);
    }
}
