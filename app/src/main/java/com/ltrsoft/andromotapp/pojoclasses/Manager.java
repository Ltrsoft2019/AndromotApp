package com.ltrsoft.andromotapp.pojoclasses;

public class Manager {

    private int Manager_id;
    private String manager_fullname;
    private String country;
    private String state;
    private String district;
    private String city;
    private String email_id;
    private String password;
    private String address;
    private int mobile1;
    private int mobile2;

    public Manager(int manager_id, String manager_fullname, String country, String state, String district, String city, String email_id, String password, String address, int mobile1, int mobile2) {
        Manager_id = manager_id;
        this.manager_fullname = manager_fullname;
        this.country = country;
        this.state = state;
        this.district = district;
        this.city = city;
        this.email_id = email_id;
        this.password = password;
        this.address = address;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
    }

    public int getManager_id() {
        return Manager_id;
    }

    public void setManager_id(int manager_id) {
        Manager_id = manager_id;
    }

    public String getManager_fullname() {
        return manager_fullname;
    }

    public void setManager_fullname(String manager_fullname) {
        this.manager_fullname = manager_fullname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile1() {
        return mobile1;
    }

    public void setMobile1(int mobile1) {
        this.mobile1 = mobile1;
    }

    public int getMobile2() {
        return mobile2;
    }

    public void setMobile2(int mobile2) {
        this.mobile2 = mobile2;
    }
}
