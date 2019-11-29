package com.example.listviewapplication.DzaipiNineteenTwenty;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiSummaryEighteenNineteen extends AppCompatActivity {

    PDFView subcounty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitanda_county);
        subcounty = findViewById(R.id.kitanda_county);
        subcounty.fromAsset("Short Summary.pdf").load();
    }
}
