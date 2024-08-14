package com.ltrsoft.andromotapp.pojoclasses;

public class Service_Client {

    private int service_client_id;
    private int service_provider_id;
    private int client_id;
    private String server_name;
    private String service_description;
    private String service_date;
    private String updated_warranty_date;

    public Service_Client(int service_client_id, int service_provider_id, int client_id, String server_name, String service_description, String service_date, String updated_warranty_date) {
        this.service_client_id = service_client_id;
        this.service_provider_id = service_provider_id;
        this.client_id = client_id;
        this.server_name = server_name;
        this.service_description = service_description;
        this.service_date = service_date;
        this.updated_warranty_date = updated_warranty_date;
    }

    public int getService_client_id() {
        return service_client_id;
    }

    public void setService_client_id(int service_client_id) {
        this.service_client_id = service_client_id;
    }

    public int getService_provider_id() {
        return service_provider_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.service_provider_id = service_provider_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
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
