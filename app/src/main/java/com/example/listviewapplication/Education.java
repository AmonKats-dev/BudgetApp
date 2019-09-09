package com.example.listviewapplication;

public class Education {
    private final String vote;
    private final String schoolname;
    private final String validation_attendance;
    private final String threshold;
    private final String variable;
    private final String annual_budget;
    private final String quarter_release;

    public Education(String vote, String schoolname, String validation_attendance, String threshold, String variable, String annual_budget, String quarter_release) {
        this.vote = vote;
        this.schoolname = schoolname;
        this.validation_attendance = validation_attendance;
        this.threshold = threshold;
        this.variable = variable;
        this.annual_budget = annual_budget;
        this.quarter_release = quarter_release;
    }

    public String getVote() {
        return vote;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public String getValidation_attendance() {
        return validation_attendance;
    }

    public String getThreshold() {
        return threshold;
    }

    public String getVariable() {
        return variable;
    }

    public String getAnnual_budget() {
        return annual_budget;
    }

    public String getQuarter_release() {
        return quarter_release;
    }





}
