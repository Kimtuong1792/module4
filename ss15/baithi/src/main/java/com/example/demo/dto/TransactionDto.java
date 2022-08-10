package com.example.demo.dto;

import com.example.demo.model.Customer;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class TransactionDto {
    @NotBlank
    @Pattern(regexp = "MGD-[0-9]{4}",
            message = "Mã giao dịch phải có kiểm (MGD-XXXX), trong đó XXXX là các chữ số (0-9).")
    private String id;
    @NotBlank
    private String day;

    private String type;

    private Double cost;

    private Double area;

    private Customer customer;

    public TransactionDto() {
    }

    public TransactionDto(String id, String day, String type, Double cost, Double area, Customer customer) {
        this.id = id;
        this.day = day;
        this.type = type;
        this.cost = cost;
        this.area = area;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
