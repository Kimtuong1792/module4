package codegym.casestudym4.model.contract;

import codegym.casestudym4.model.customer.Customer;
import codegym.casestudym4.model.customer.CustomerType;
import codegym.casestudym4.model.employee.Employee;
import codegym.casestudym4.model.facility.Facility;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private double deposit;

    @ManyToOne
    @JoinColumn(name = "customer_id" , referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id" , referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "facility_id" , referencedColumnName = "id")
    private Facility facility;

    @OneToMany(mappedBy = "contract")
    Set<ContractDetail> contractDetails;
    public Contract() {
    }

    public Contract(int id, LocalDate startDate, LocalDate endDate, double deposit,
                    Customer customer, Employee employee, Facility facility,
                    Set<ContractDetail> contractDetails) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.customer = customer;
        this.employee = employee;
        this.facility = facility;
        this.contractDetails = contractDetails;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

}
