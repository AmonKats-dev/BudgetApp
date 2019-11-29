package com.example.listviewapplication;

public class FacilitiesList {

    private String facility;
    private int rightArrow;

    public FacilitiesList(){}

    public FacilitiesList(String facility, int rightArrow) {
        this.facility = facility;
        this.rightArrow = rightArrow;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void setRightArrow(int rightArrow) {
        this.rightArrow = rightArrow;
    }

    public String getFacility() {
        return facility;
    }

    public int getRightArrow() {
        return rightArrow;
    }
}
