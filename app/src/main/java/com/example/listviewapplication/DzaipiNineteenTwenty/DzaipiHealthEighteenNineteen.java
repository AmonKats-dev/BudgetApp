package com.example.listviewapplication.DzaipiNineteenTwenty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiHealthEighteenNineteen extends AppCompatActivity {
 PDFView health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzaipi_health_eighteen_nineteen);

        health = findViewById(R.id.health_eighteen);
        health.fromAsset("Dzaipi_health_Year1819.pdf").load();
    }
}
