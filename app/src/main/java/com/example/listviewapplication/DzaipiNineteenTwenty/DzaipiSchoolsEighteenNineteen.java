package com.example.listviewapplication.DzaipiNineteenTwenty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiSchoolsEighteenNineteen extends AppCompatActivity {

    PDFView schools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzaipi_schools_eighteen_nineteen);

        schools = findViewById(R.id.schools_eighteen);
        schools.fromAsset("Dzaipi_schools_Year1819.pdf").load();
    }
}
