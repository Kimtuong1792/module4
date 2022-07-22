package com.codegym.model;

import org.springframework.stereotype.Controller;


public class MedicalDeclaration {
    private String name;
    private Integer birthday;
    private String gender;
    private String country;
    private String identity;
    private String render;
    private String vehicleNumber;
    private String seats;
    private Integer starDay;
    private Integer starMonth;
    private Integer starYear;
    private Integer endDay;
    private Integer endMonth;
    private Integer endYear;
    private String information;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, Integer birthday, String gender,
                              String country, String identity, String render,
                              String vehicleNumber, String seats, Integer starDay,
                              Integer starMonth, Integer starYear, Integer endDay,
                              Integer endMonth, Integer endYear, String information) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.country = country;
        this.identity = identity;
        this.render = render;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.starDay = starDay;
        this.starMonth = starMonth;
        this.starYear = starYear;
        this.endDay = endDay;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Integer getStarDay() {
        return starDay;
    }

    public void setStarDay(Integer starDay) {
        this.starDay = starDay;
    }

    public Integer getStarMonth() {
        return starMonth;
    }

    public void setStarMonth(Integer starMonth) {
        this.starMonth = starMonth;
    }

    public Integer getStarYear() {
        return starYear;
    }

    public void setStarYear(Integer starYear) {
        this.starYear = starYear;
    }

    public Integer getEndDay() {
        return endDay;
    }

    public void setEndDay(Integer endDay) {
        this.endDay = endDay;
    }

    public Integer getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
