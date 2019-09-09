package com.example.listviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PopulateActivity extends AppCompatActivity {
    
    private RecyclerView mRecyclerView;
    private List<Object> mRecyclerViewItems = new ArrayList<>();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_populate);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(this, mRecyclerViewItems, mContext);
        mRecyclerView.setAdapter(adapter);
        addMenuItemsFromJson();
    }

    private void addMenuItemsFromJson() {
        try{
            String jsonDataString = readJsonDataFromFile();
            JSONArray menuItemsJsonArray = new JSONArray(jsonDataString);
            for (int i = 0; i < menuItemsJsonArray.length(); ++i){
                JSONObject menuItemObject = menuItemsJsonArray.getJSONObject(i);

                String menuItemVote = menuItemObject.getString("vote");
                String menuItemSchoolName = menuItemObject.getString("school_name");
                String menuItemValidationAttendance = menuItemObject.getString("validation_attendance");
                String menuItemThreshold = menuItemObject.getString("threshold");
                String menuItemVariable = menuItemObject.getString("variable");
                String menuItemAnnualBudget = menuItemObject.getString("annual_budget");
                String menuItemQuarterRelease = menuItemObject.getString("quarter_three_release");

                Education education = new Education(menuItemVote, menuItemSchoolName,
                        menuItemValidationAttendance, menuItemThreshold, menuItemVariable, menuItemAnnualBudget,
                        menuItemQuarterRelease);
                mRecyclerViewItems.add(education);


            }
        }catch(JSONException | IOException e){
            Log.e(PopulateActivity.class.getName(), "Unable to parse JSON file", e);

        }
    }

    private String readJsonDataFromFile() throws IOException {
        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder();

        try{
            String jsonDataString = null;
            inputStream = getResources().openRawResource(R.raw.primary_schools);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while ((jsonDataString = bufferedReader.readLine()) != null){
                builder.append(jsonDataString);
            }
        }finally {
            if (inputStream != null){
                inputStream.close();
            }
        }

        return new String(builder);
    }
}
