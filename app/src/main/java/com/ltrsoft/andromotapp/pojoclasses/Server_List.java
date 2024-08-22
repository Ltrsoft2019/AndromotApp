package com.ltrsoft.andromotapp.pojoclasses;

public class Server_List {

    private int server_id;
    private String server_name_id;
    private String server_manufacture_date;
    private String server_description;

    public Server_List(int server_id, String server_name_id, String server_manufacture_date, String server_description) {
        this.server_id = server_id;
        this.server_name_id = server_name_id;
        this.server_manufacture_date = server_manufacture_date;
        this.server_description = server_description;
    }

    public Server_List(String server_name_id , String server_description)
    {
        this.server_name_id = server_name_id;
        this.server_description = server_description;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public String getServer_name_id() {
        return server_name_id;
    }

    public void setServer_name_id(String server_name_id) {
        this.server_name_id = server_name_id;
    }

    public String getServer_manufacture_date() {
        return server_manufacture_date;
    }

    public void setServer_manufacture_date(String server_manufacture_date) {
        this.server_manufacture_date = server_manufacture_date;
    }

    public String getServer_description() {
        return server_description;
    }

    public void setServer_description(String server_description) {
        this.server_description = server_description;
    }
}
