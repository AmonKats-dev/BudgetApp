package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String, List<String>> listItem;
    ExpandableAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        expandableListView = findViewById(R.id.expandable_listview);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new ExpandableAdapter(this, listGroup, listItem);
        expandableListView.setAdapter(adapter);
        initListData();
    }

    private void initListData() {
        listGroup.add(getString(R.string.group1));
        listGroup.add(getString(R.string.group2));
        listGroup.add(getString(R.string.group3));
        listGroup.add(getString(R.string.group4));
        listGroup.add(getString(R.string.group5));
        listGroup.add(getString(R.string.group6));
        listGroup.add(getString(R.string.group7));
        listGroup.add(getString(R.string.group8));
        listGroup.add(getString(R.string.group9));
        listGroup.add(getString(R.string.group10));
        listGroup.add(getString(R.string.group11));
        listGroup.add(getString(R.string.group12));

        String[] array;

        //List 1
        final List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for (String item : array){
            list1.add(item);
        }

        // List 2
        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group2);
        for (String item : array){
            list2.add(item);
        }

        // List 3
        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for (String item : array){
            list3.add(item);
        }

        // List 4
        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group4);
        for (String item : array){
            list4.add(item);
        }

        // List 5
        List<String> list5 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group5);
        for (String item : array){
            list5.add(item);
        }

        // List 6
        List<String> list6 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group6);
        for (String item : array){
            list6.add(item);
        }

        List<String> list7 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group7);
        for (String item : array){
            list7.add(item);
        }

        List<String> list8 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group8);
        for (String item : array){
            list8.add(item);
        }

        List<String> list9 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group9);
        for (String item : array){
            list9.add(item);
        }

        List<String> list10 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group10);
        for (String item : array){
            list10.add(item);
        }

        List<String> list11 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group11);
        for (String item : array){
            list11.add(item);
        }

        List<String> list12 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group12);
        for (String item : array){
            list12.add(item);
        }


        listItem.put(listGroup.get(0), list1);
        listItem.put(listGroup.get(1), list2);
        listItem.put(listGroup.get(2), list3);
        listItem.put(listGroup.get(3), list4);
        listItem.put(listGroup.get(4), list5);
        listItem.put(listGroup.get(5), list6);
        listItem.put(listGroup.get(6), list7);
        listItem.put(listGroup.get(7), list8);
        listItem.put(listGroup.get(8), list9);
        listItem.put(listGroup.get(9), list10);
        listItem.put(listGroup.get(10), list11);
        listItem.put(listGroup.get(11), list12);
        adapter.notifyDataSetChanged();

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                if (groupPosition == 0 && childPosition == 0){
                    /*Intent intent = new Intent(ExpandableActivity.this, detail_layout.class);
                    startActivity(intent);*/
                }

                if (groupPosition == 5 && childPosition == 0){
                    Intent intent = new Intent(ExpandableActivity.this, AdjumaniPrimary.class);
                    startActivity(intent);
                }
                return true;
            }
        });


       /* expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
                ClipData.Item item = (ClipData.Item) adapter.getGroup(groupPosition);
                handleClick(item);
                return true;
            }
        });*/

    }



}
