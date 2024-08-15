package com.ltrsoft.andromotapp.pojoclasses;

public class Service_Providers {

    private int service_provider_id;
    private String servicep_full_name;
    private String shop_name;
    private int mobile;
    private String country;
    private String state;
    private String district;
    private String city;
    private String email_id;
    private String password;
    private String address;
    private String pan_no;
    private String gst_no;
    private String is_distributer;

    public Service_Providers(int service_provider_id, String servicep_full_name, String shop_name, int mobile, String country, String state, String district, String city, String email_id, String password, String address, String pan_no, String gst_no, String is_distributer) {
        this.service_provider_id = service_provider_id;
        this.servicep_full_name = servicep_full_name;
        this.shop_name = shop_name;
        this.mobile = mobile;
        this.country = country;
        this.state = state;
        this.district = district;
        this.city = city;
        this.email_id = email_id;
        this.password = password;
        this.address = address;
        this.pan_no = pan_no;
        this.gst_no = gst_no;
        this.is_distributer = is_distributer;
    }

    public int getService_provider_id() {
        return service_provider_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.service_provider_id = service_provider_id;
    }

    public String getServicep_full_name() {
        return servicep_full_name;
    }

    public void setServicep_full_name(String servicep_full_name) {
        this.servicep_full_name = servicep_full_name;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
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

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getGst_no() {
        return gst_no;
    }

    public void setGst_no(String gst_no) {
        this.gst_no = gst_no;
    }

    public String getIs_distributer() {
        return is_distributer;
    }

    public void setIs_distributer(String is_distributer) {
        this.is_distributer = is_distributer;
    }
}
