package com.example.listviewapplication.DzaipiNineteenTwenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.listviewapplication.FacilitiesAdapter;
import com.example.listviewapplication.FacilitiesList;
import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class DzaipiFinancialYearNineteenTwenty extends AppCompatActivity {

    ListView bukomansimbiListview;
    String[] listItems;
    TypedArray rightArrowImage;
    TextView textView;
    ArrayList<FacilitiesList> facilitiesLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukomansimbi_sub_counties);

        textView = findViewById(R.id.textView);

        bukomansimbiListview = findViewById(R.id.listview_bukomansimbi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        facilitiesLists = new ArrayList<>();
        listItems = getResources().getStringArray(R.array.facilities);
        rightArrowImage = getResources().obtainTypedArray(R.array.right_arrow_image);

        final ArrayAdapter adapter = new ArrayAdapter(this, R.layout.attach_facilities, listItems);
        byte b = 0;
        while (true) {
            String[] arrayOfString = this.listItems;
            if (b < arrayOfString.length) {
                FacilitiesList facilities1 = new FacilitiesList(arrayOfString[b], this.rightArrowImage.getResourceId(b, -1));
                this.facilitiesLists.add(facilities1);
                b++;
                continue;
            }
            break;
        }

        FacilitiesAdapter facilitiesAdapter = new FacilitiesAdapter(this, facilitiesLists);
        bukomansimbiListview.setAdapter(facilitiesAdapter);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItems);
        bukomansimbiListview.setAdapter(adapter);*/

        bukomansimbiListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent intent = new Intent(DzaipiFinancialYearNineteenTwenty.this, DzaipiSummaryNineteenTwenty.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(DzaipiFinancialYearNineteenTwenty.this, DzaipiSchoolsNineteenTwenty.class);
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(DzaipiFinancialYearNineteenTwenty.this, DzaipiHealthNineteenTwenty.class);
                    startActivity(intent);
                }
            }
        });

    }
}
