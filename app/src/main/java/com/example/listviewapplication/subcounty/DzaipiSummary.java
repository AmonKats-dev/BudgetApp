package com.example.listviewapplication.subcounty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiSummary extends AppCompatActivity {

    PDFView subcounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitanda_county);

        subcounty = findViewById(R.id.kitanda_county);
        subcounty.fromAsset("short_summary_dzaipi.pdf").load();
    }
}
