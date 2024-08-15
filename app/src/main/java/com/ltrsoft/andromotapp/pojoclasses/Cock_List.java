package com.ltrsoft.andromotapp.pojoclasses;

public class Cock_List {

    private int cock_id;
    private int cock_name_id;
    private String cock_manufacture_date;
    private String cock_description;

    public Cock_List(int cock_id, int cock_name_id, String cock_manufacture_date, String cock_description) {
        this.cock_id = cock_id;
        this.cock_name_id = cock_name_id;
        this.cock_manufacture_date = cock_manufacture_date;
        this.cock_description = cock_description;
    }

    public int getCock_id() {
        return cock_id;
    }

    public void setCock_id(int cock_id) {
        this.cock_id = cock_id;
    }

    public int getCock_name_id() {
        return cock_name_id;
    }

    public void setCock_name_id(int cock_name_id) {
        this.cock_name_id = cock_name_id;
    }

    public String getCock_manufacture_date() {
        return cock_manufacture_date;
    }

    public void setCock_manufacture_date(String cock_manufacture_date) {
        this.cock_manufacture_date = cock_manufacture_date;
    }

    public String getCock_description() {
        return cock_description;
    }

    public void setCock_description(String cock_description) {
        this.cock_description = cock_description;
    }
}
