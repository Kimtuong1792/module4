package com.codegym.repository;

import com.codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MedicalRepository implements IMedicalRepository {
    private final List<Integer> birthdayList = new ArrayList<>();
    private final List<String> genderList = new ArrayList<>();
    private final List<String> countryList = new ArrayList<>();
    private final List<String> renderList = new ArrayList<>();
    private final List<Integer> starDayList = new ArrayList<>();
    private final List<Integer> starMonthList = new ArrayList<>();
    private final List<Integer> starYearList = new ArrayList<>();
    private final List<Integer> endDayList = new ArrayList<>();
    private final List<Integer> endMonthList = new ArrayList<>();
    private final List<Integer> endYearList = new ArrayList<>();
    private final List<MedicalDeclaration> medicalDeclarationList = new ArrayList<>();

    {
        birthdayList.add(2000);
        birthdayList.add(1999);
        birthdayList.add(1998);
        birthdayList.add(1997);
        birthdayList.add(1996);
        birthdayList.add(1995);
        birthdayList.add(1994);
    }

    {
        genderList.add("male");
        genderList.add("female");
    }

    {
        countryList.add("VietNam");
        countryList.add("Lao");
        countryList.add("campuchia");
        countryList.add("Trung Quoc");
    }

    {
        renderList.add("Tau bay");
        renderList.add("Tau thuyen");
        renderList.add("O to");
        renderList.add("khac");
    }

    {
        starDayList.add(1);
        starDayList.add(2);
        starDayList.add(3);
        starDayList.add(4);
        starDayList.add(5);
        starDayList.add(6);
        starDayList.add(7);
        starDayList.add(8);
        starDayList.add(9);
        starDayList.add(10);
        starDayList.add(11);
        starDayList.add(12);
        starDayList.add(13);
        starDayList.add(14);
        starDayList.add(15);
        starDayList.add(16);
        starDayList.add(17);
        starDayList.add(18);
        starDayList.add(19);
        starDayList.add(20);
        starDayList.add(21);
        starDayList.add(22);
        starDayList.add(23);
        starDayList.add(24);
        starDayList.add(25);
        starDayList.add(26);
        starDayList.add(27);
        starDayList.add(28);
        starDayList.add(29);
        starDayList.add(30);
    }

    {
        starMonthList.add(1);
        starMonthList.add(2);
        starMonthList.add(3);
        starMonthList.add(4);
        starMonthList.add(5);
        starMonthList.add(6);
        starMonthList.add(7);
        starMonthList.add(8);
        starMonthList.add(9);
        starMonthList.add(10);
        starMonthList.add(11);
        starMonthList.add(12);
    }

    {
        starYearList.add(2021);
        starYearList.add(2022);
    }

    {
        endDayList.add(1);
        endDayList.add(2);
        endDayList.add(3);
        endDayList.add(4);
        endDayList.add(5);
        endDayList.add(6);
        endDayList.add(7);
        endDayList.add(8);
        endDayList.add(9);
        endDayList.add(10);
        endDayList.add(11);
        endDayList.add(12);
        endDayList.add(13);
        endDayList.add(14);
        endDayList.add(15);
        endDayList.add(16);
        endDayList.add(17);
        endDayList.add(18);
        endDayList.add(19);
        endDayList.add(20);
        endDayList.add(21);
        endDayList.add(22);
        endDayList.add(23);
        endDayList.add(24);
        endDayList.add(25);
        endDayList.add(26);
        endDayList.add(27);
        endDayList.add(28);
        endDayList.add(29);
        endDayList.add(30);
    }

    {
        endMonthList.add(1);
        endMonthList.add(2);
        endMonthList.add(3);
        endMonthList.add(4);
        endMonthList.add(5);
        endMonthList.add(6);
        endMonthList.add(7);
        endMonthList.add(8);
        endMonthList.add(9);
        endMonthList.add(10);
        endMonthList.add(11);
        endMonthList.add(12);
    }

    {
        endYearList.add(2021);
        endYearList.add(2022);
    }
    {
        medicalDeclarationList.add(new MedicalDeclaration("tuong",1992,"female","Viet Nam",
                "123450123","O to","20302","10",10,10,2021,11,
                11,2022,"abc"));
        medicalDeclarationList.add(new MedicalDeclaration("dat",1992,"female","Viet Nam",
                "123451234","O to","20302","10",10,10,2021,11,
                11,2022,"abc"));
        medicalDeclarationList.add(new MedicalDeclaration("luat",1992,"female","Viet Nam",
                "123455678","O to","20302","10",10,10,2021,11,
                11,2022,"abc"));
    }

    @Override
    public List<Integer> birthdayList() {
        return birthdayList;
    }

    @Override
    public List<String> genderList() {
        return genderList;
    }

    @Override
    public List<String> countryList() {
        return countryList;
    }

    @Override
    public List<String> renderList() {
        return renderList;
    }

    @Override
    public List<Integer> starDayList() {
        return starDayList;
    }

    @Override
    public List<Integer> starMonthList() {
        return starMonthList;
    }

    @Override
    public List<Integer> starYearList() {
        return starYearList;
    }

    @Override
    public List<Integer> endDayList() {
        return endDayList;
    }

    @Override
    public List<Integer> endMonthList() {
        return endMonthList;
    }

    @Override
    public List<Integer> endYearList() {
        return endYearList;
    }

    @Override
    public List<MedicalDeclaration> findAll() {
        return medicalDeclarationList;
    }

    @Override
    public MedicalDeclaration findOne(String identity) {
        MedicalDeclaration medicalDeclaration = null;

        for (MedicalDeclaration item : medicalDeclarationList) {
            if (item.getIdentity().equals(identity)) {
                medicalDeclaration = new MedicalDeclaration(item.getName(), item.getBirthday(),
                        item.getGender(), item.getCountry(), item.getIdentity(), item.getRender(),
                        item.getVehicleNumber(), item.getSeats(), item.getStarDay(), item.getStarMonth(),
                        item.getStarYear(), item.getEndDay(), item.getEndMonth(), item.getEndYear(),
                        item.getInformation());
            }
        }
        return medicalDeclaration;
    }

    @Override
    public void update(String identity, MedicalDeclaration medicalDeclaration) {
        for (MedicalDeclaration item : medicalDeclarationList) {
            if (item.getIdentity().equals(identity)) {
                item.setName(medicalDeclaration.getName());
                item.setBirthday(medicalDeclaration.getBirthday());
                item.setGender(medicalDeclaration.getGender());
                item.setCountry(medicalDeclaration.getCountry());
                item.setIdentity(medicalDeclaration.getIdentity());
                item.setRender(medicalDeclaration.getRender());
                item.setVehicleNumber(medicalDeclaration.getVehicleNumber());
                item.setStarDay(medicalDeclaration.getStarDay());
                item.setStarMonth(medicalDeclaration.getStarMonth());
                item.setStarYear(medicalDeclaration.getStarYear());
                item.setEndDay(medicalDeclaration.getEndDay());
                item.setEndMonth(medicalDeclaration.getEndMonth());
                item.setEndYear(medicalDeclaration.getEndYear());
                item.setInformation(medicalDeclaration.getInformation());
            }
        }
    }

    @Override
    public void save(MedicalDeclaration medicalDeclaration) {
        medicalDeclarationList.add(medicalDeclaration);
    }
}
