package com.example.listviewapplication;

import android.widget.ImageView;

public class DistrictList {

    private String districtName;
    private int rightArrow;

    public DistrictList(){

    }

    public DistrictList(String districtName, int rightArrow) {
        this.districtName = districtName;
        this.rightArrow = rightArrow;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getRightArrow() {
        return rightArrow;
    }

    public void setRightArrow(int rightArrow) {
        this.rightArrow = rightArrow;
    }



}
