package com.example.listviewapplication.DzaipiNineteenTwenty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listviewapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class DzaipiBudgetSummaryEighteenNine extends AppCompatActivity {

    PDFView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzaipi_budget_summary_eighteen_nine);

        summary = findViewById(R.id.summary_eighteen);
        summary.fromAsset("Short Summary.pdf").load();
    }
}
