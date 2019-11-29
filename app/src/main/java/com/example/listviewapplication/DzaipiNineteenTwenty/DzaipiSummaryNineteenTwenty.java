package com.example.listviewapplication.DzaipiNineteenTwenty;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiSummaryNineteenTwenty extends AppCompatActivity {

    PDFView subcounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitanda_county);
        subcounty = findViewById(R.id.kitanda_county);
        subcounty.fromAsset("Dzaipi_Short_Summary_Year1920.pdf").load();
    }
}
