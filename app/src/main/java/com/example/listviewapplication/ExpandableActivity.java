package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.listviewapplication.subcounty.BukomansimbiSubCounties;

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
        listGroup.add(getString(R.string.group0));
        listGroup.add(getString(R.string.group1));
        listGroup.add(getString(R.string.group2));

        String[] array;

        //List 0
        final List<String> list0 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group0);
        for (String item : array){
            list0.add(item);
        }

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


        listItem.put(listGroup.get(0), list0);
        listItem.put(listGroup.get(1), list1);
        listItem.put(listGroup.get(2), list2);
        adapter.notifyDataSetChanged();

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                if (groupPosition == 0 && childPosition == 0){
                    Intent intent = new Intent(ExpandableActivity.this, BukomansimbiSubCounties.class);
                    startActivity(intent);
                }

                if (groupPosition == 6 && childPosition == 0){
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
