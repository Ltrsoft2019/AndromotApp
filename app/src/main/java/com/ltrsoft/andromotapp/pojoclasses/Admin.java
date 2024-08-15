package com.ltrsoft.andromotapp.pojoclasses;

public class Admin {
    String id, admin_fname, admin_mname,admin_lname,coutry,state,
            district,city,email_id,password,address,mobile1,mobile2;

    public Admin(String id, String admin_fname, String admin_mname, String admin_lname, String coutry, String state, String district, String city, String email_id, String password, String address, String mobile1, String mobile2) {
        this.id = id;
        this.admin_fname = admin_fname;
        this.admin_mname = admin_mname;
        this.admin_lname = admin_lname;
        this.coutry = coutry;
        this.state = state;
        this.district = district;
        this.city = city;
        this.email_id = email_id;
        this.password = password;
        this.address = address;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdmin_fname() {
        return admin_fname;
    }

    public void setAdmin_fname(String admin_fname) {
        this.admin_fname = admin_fname;
    }

    public String getAdmin_mname() {
        return admin_mname;
    }

    public void setAdmin_mname(String admin_mname) {
        this.admin_mname = admin_mname;
    }

    public String getAdmin_lname() {
        return admin_lname;
    }

    public void setAdmin_lname(String admin_lname) {
        this.admin_lname = admin_lname;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
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

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }
}
