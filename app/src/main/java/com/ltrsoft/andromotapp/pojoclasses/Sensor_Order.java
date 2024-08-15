package com.ltrsoft.andromotapp.pojoclasses;

public class Sensor_Order {
    String order_id,sensor_type_id,user_id,quantity,total_price,payment_mode,order_status;

    public Sensor_Order(String order_id, String sensor_type_id, String user_id, String quantity, String total_price, String payment_mode, String order_status) {
        this.order_id = order_id;
        this.sensor_type_id = sensor_type_id;
        this.user_id = user_id;
        this.quantity = quantity;
        this.total_price = total_price;
        this.payment_mode = payment_mode;
        this.order_status = order_status;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getSensor_type_id() {
        return sensor_type_id;
    }

    public void setSensor_type_id(String sensor_type_id) {
        this.sensor_type_id = sensor_type_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
}
