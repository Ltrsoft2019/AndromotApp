package com.ltrsoft.andromotapp.pojoclasses;

public class Enquiry_Problem {

    private int enquiry_problem_id;
    private String problem_subject;
    private String problem_description;
    private int user_id;
    private String enquiry_date;

    public Enquiry_Problem(int enquiry_problem_id, String problem_subject, String problem_description, int user_id, String enquiry_date) {
        this.enquiry_problem_id = enquiry_problem_id;
        this.problem_subject = problem_subject;
        this.problem_description = problem_description;
        this.user_id = user_id;
        this.enquiry_date = enquiry_date;
    }

    public int getEnquiry_problem_id() {
        return enquiry_problem_id;
    }

    public void setEnquiry_problem_id(int enquiry_problem_id) {
        this.enquiry_problem_id = enquiry_problem_id;
    }

    public String getProblem_subject() {
        return problem_subject;
    }

    public void setProblem_subject(String problem_subject) {
        this.problem_subject = problem_subject;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEnquiry_date() {
        return enquiry_date;
    }

    public void setEnquiry_date(String enquiry_date) {
        this.enquiry_date = enquiry_date;
    }
}
