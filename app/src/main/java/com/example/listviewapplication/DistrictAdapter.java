package com.example.listviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DistrictAdapter extends BaseAdapter {

    Context context;
    List<DistrictList> districtData;

    public DistrictAdapter(Context context, List<DistrictList> districtData) {
        this.context = context;
        this.districtData = districtData;
    }


    @Override
    public int getCount() {
        return districtData.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DistrictList district = districtData.get(i);

        //if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.attach_layout, null);
           TextView districtName = view.findViewById(R.id.textView);
            ImageView arrowImage = view.findViewById(R.id.imageView);


            districtName.setText(district.getDistrictName());
            //arrowImage.setImageResource(district.getRightArrow());

            return view;


    }
}
