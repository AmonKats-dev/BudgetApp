package com.example.listviewapplication.subcounty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiHealth extends AppCompatActivity {

    PDFView subcounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzaipi_health);

        subcounty = findViewById(R.id.butega_county);
        subcounty.fromAsset("Dzaipi_health.pdf").load();
    }
}
