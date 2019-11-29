package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FacilitiesAdapter extends BaseAdapter {

    Context context;
    List<FacilitiesList> myThreeList;

    public FacilitiesAdapter(Context context, List<FacilitiesList> myThreeList) {
        this.context = context;
        this.myThreeList = myThreeList;
    }

    @Override
    public int getCount() {
        return myThreeList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FacilitiesList facilitiesList = myThreeList.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.attach_facilities, null);
        TextView facility = convertView.findViewById(R.id.facilityTxtView);
        ImageView arrowImage = convertView.findViewById(R.id.imageView);

        facility.setText(facilitiesList.getFacility());
        return convertView;
    }
}
