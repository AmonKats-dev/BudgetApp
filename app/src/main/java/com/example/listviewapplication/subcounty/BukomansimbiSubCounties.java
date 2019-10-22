package com.example.listviewapplication.subcounty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class BukomansimbiSubCounties extends AppCompatActivity {

    ListView bukomansimbiListview;
    String[] listItems;
    PDFView subcounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukomansimbi_sub_counties);

        bukomansimbiListview = findViewById(R.id.listview_bukomansimbi);
        listItems = getResources().getStringArray(R.array.bukomansimbi_subcounties);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItems);
        bukomansimbiListview.setAdapter(adapter);
        bukomansimbiListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent intent = new Intent(BukomansimbiSubCounties.this, ButegaSubCounty.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(BukomansimbiSubCounties.this, KitandaSubCounty.class);
                    startActivity(intent);
                }
            }
        });
    }
}
