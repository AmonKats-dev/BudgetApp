package com.example.listviewapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class AdjumaniPrimary extends AppCompatActivity {

    ListView adjumaniListview;
    String[] listItems;
    PDFView primarySchools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjumani_primary);

        /*primarySchools = findViewById(R.id.pdfAllPrimarySchools);

        primarySchools.fromAsset("All_primary_schools_14_15.pdf").load();*/

        adjumaniListview = findViewById(R.id.primary_adj_listview);
        listItems = getResources().getStringArray(R.array.adjumani_fy_primary);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItems);
        adjumaniListview.setAdapter(adapter);
        adjumaniListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(AdjumaniPrimary.this, PopulateActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
