package com.example.listviewapplication;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listItem;
    TypedArray right_arrow_image;
    TextView textView;
    ArrayList<DistrictList> districtList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lstView);

        //searchView = findViewById(R.id.searchView);

        textView = findViewById(R.id.textView);
        listItem = getResources().getStringArray(R.array.districts);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        districtList = new ArrayList();
        listItem = getResources().getStringArray(R.array.districts);
        right_arrow_image = getResources().obtainTypedArray(R.array.right_arrow_image);

        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.attach_layout, listItem);
        byte b = 0;
        while (true) {
            String[] arrayOfString = this.listItem;
            if (b < arrayOfString.length) {
                DistrictList districtList1 = new DistrictList(arrayOfString[b], this.right_arrow_image.getResourceId(b, -1));
                this.districtList.add(districtList1);
                b++;
                continue;
            }
            break;
        }

        DistrictAdapter adapterDistrict = new DistrictAdapter(this, districtList);
        listView.setAdapter(adapterDistrict);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
                if (param1Int == 0) {
                    Intent intent = new Intent(MainActivity.this, ExpandableActivity.class);
                    startActivity(intent);
                }
                /*else if (param1Int == 1){
                    Intent intent = new Intent(MainActivity.this, ExpandableActivity.class);
                    startActivity(intent);
                }*/
            }
        });


    }

}

