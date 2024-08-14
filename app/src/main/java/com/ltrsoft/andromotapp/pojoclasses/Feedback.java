package com.ltrsoft.andromotapp.pojoclasses;

public class Feedback {
    String feedback_id,user_id,rating,description;

    public Feedback(String feedback_id, String user_id, String rating, String description) {
        this.feedback_id = feedback_id;
        this.user_id = user_id;
        this.rating = rating;
        this.description = description;
    }

    public String getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(String feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
