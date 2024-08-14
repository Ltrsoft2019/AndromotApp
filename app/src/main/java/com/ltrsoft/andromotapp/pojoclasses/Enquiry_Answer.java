package com.ltrsoft.andromotapp.pojoclasses;

public class Enquiry_Answer {

    private int enquiry_answer_id;
    private int enquiry_problem_id;
    private int manager_id;
    private String answer_description;
    private String answer_date;

    public Enquiry_Answer(int enquiry_answer_id, int enquiry_problem_id, int manager_id, String answer_description, String answer_date) {
        this.enquiry_answer_id = enquiry_answer_id;
        this.enquiry_problem_id = enquiry_problem_id;
        this.manager_id = manager_id;
        this.answer_description = answer_description;
        this.answer_date = answer_date;
    }

    public int getEnquiry_answer_id() {
        return enquiry_answer_id;
    }

    public void setEnquiry_answer_id(int enquiry_answer_id) {
        this.enquiry_answer_id = enquiry_answer_id;
    }

    public int getEnquiry_problem_id() {
        return enquiry_problem_id;
    }

    public void setEnquiry_problem_id(int enquiry_problem_id) {
        this.enquiry_problem_id = enquiry_problem_id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getAnswer_description() {
        return answer_description;
    }

    public void setAnswer_description(String answer_description) {
        this.answer_description = answer_description;
    }

    public String getAnswer_date() {
        return answer_date;
    }

    public void setAnswer_date(String answer_date) {
        this.answer_date = answer_date;
    }
}
