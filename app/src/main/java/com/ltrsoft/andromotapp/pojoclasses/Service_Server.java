package com.ltrsoft.andromotapp.pojoclasses;

public class Service_Server {

    private int service_server_id;
    private int service_provider_id;
    private int server_id;
    private String server_name;
    private String service_description;
    private String service_date;
    private String updated_warranty_date;

    public Service_Server(int service_server_id, int service_provider_id, int server_id, String server_name, String service_description, String service_date, String updated_warranty_date) {
        this.service_server_id = service_server_id;
        this.service_provider_id = service_provider_id;
        this.server_id = server_id;
        this.server_name = server_name;
        this.service_description = service_description;
        this.service_date = service_date;
        this.updated_warranty_date = updated_warranty_date;
    }

    public int getService_server_id() {
        return service_server_id;
    }

    public void setService_server_id(int service_server_id) {
        this.service_server_id = service_server_id;
    }

    public int getService_provider_id() {
        return service_provider_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.service_provider_id = service_provider_id;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public String getServer_name() {
        return server_name;
    }

    public void setServer_name(String server_name) {
        this.server_name = server_name;
    }

    public String getService_description() {
        return service_description;
    }

    public void setService_description(String service_description) {
        this.service_description = service_description;
    }

    public String getService_date() {
        return service_date;
    }

    public void setService_date(String service_date) {
        this.service_date = service_date;
    }

    public String getUpdated_warranty_date() {
        return updated_warranty_date;
    }

    public void setUpdated_warranty_date(String updated_warranty_date) {
        this.updated_warranty_date = updated_warranty_date;
    }
}
