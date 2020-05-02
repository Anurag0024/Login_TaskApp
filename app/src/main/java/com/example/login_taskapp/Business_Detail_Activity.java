package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class Business_Detail_Activity extends AppCompatActivity {
    Button business_detail_btn;

    ArrayAdapter<CharSequence> adapter;
    AutoCompleteTextView Indsutry_Category_AutoComplete_tv,Designation_AutoComplete_tv ;

    private static final String[] Industry = new String[]{"Software industry", "mechanical industry", "automobile indusry", "Telecommunication"};
    private static final String[] Designation = new String[]{"HR", "General manager", "Accountant & finance", "General employee","CEO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__detail_);
        getSupportActionBar().setTitle("FILL YOUR BUSINESS DETAILS");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Indsutry_Category_AutoComplete_tv=(AutoCompleteTextView)findViewById(R.id.Indsutry_Category_AutoComplete);
        Designation_AutoComplete_tv=(AutoCompleteTextView)findViewById(R.id.Designation_AutoComplete);
        business_detail_btn=(Button)findViewById(R.id.business_detail_btn_id);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Industry);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,Designation);
        Indsutry_Category_AutoComplete_tv.setAdapter(adapter);
        Designation_AutoComplete_tv.setAdapter(adapter2);

        Indsutry_Category_AutoComplete_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Indsutry_Category_AutoComplete_tv.showDropDown();
            }
        });

        Designation_AutoComplete_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Designation_AutoComplete_tv.showDropDown();
            }
        });

    }

    public void business_detail(View V10){
        Intent in = new Intent(Business_Detail_Activity.this,Upload_Document_Activity.class);
        startActivity(in);
    }
}
