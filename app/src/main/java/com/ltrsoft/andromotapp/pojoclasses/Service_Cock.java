package com.ltrsoft.andromotapp.pojoclasses;

public class Service_Cock {

    private int service_cock;
    private int service_provider_id;
    private int cock_id;
    private String server_name;
    private String service_description;
    private String service_date;
    private String updated_warranty_date;

    public Service_Cock(int service_cock, int service_provider_id, int cock_id, String server_name, String service_description, String service_date, String updated_warranty_date) {
        this.service_cock = service_cock;
        this.service_provider_id = service_provider_id;
        this.cock_id = cock_id;
        this.server_name = server_name;
        this.service_description = service_description;
        this.service_date = service_date;
        this.updated_warranty_date = updated_warranty_date;
    }

    public int getService_cock() {
        return service_cock;
    }

    public void setService_cock(int service_cock) {
        this.service_cock = service_cock;
    }

    public int getService_provider_id() {
        return service_provider_id;
    }

    public void setService_provider_id(int service_provider_id) {
        this.service_provider_id = service_provider_id;
    }

    public int getCock_id() {
        return cock_id;
    }

    public void setCock_id(int cock_id) {
        this.cock_id = cock_id;
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
