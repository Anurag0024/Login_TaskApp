package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class Fill_Details_Activity extends AppCompatActivity {
     Button Fill_detail_btn;
    DatePicker datePicker_Fill_details;
    ArrayAdapter<CharSequence> adapter;
    AutoCompleteTextView Gender_autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill__details_);
        getSupportActionBar().setTitle("FILL YOUR DETAILS");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Gender_autoCompleteTextView  = (AutoCompleteTextView) findViewById(R.id.gender_AutoComplete);
        Fill_detail_btn=(findViewById(R.id.Next_Button_Fill_deatils));
        Fill_detail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Fill_Details_Activity.this,Upload_Document_Activity.class);
                startActivity(in);
            }
        });


       // datePicker_Fill_details=(DatePicker)findViewById(R.id.date_picker_DetailsFill);

        //===============================DATE picker DATA=====================================================================================
        Calendar calendar=Calendar.getInstance();

      /* ===============================================================================================================================================
       datePicker_Fill_details.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {

            }
        });
        ==============================================================================================================================================
       */

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,gender);
        Gender_autoCompleteTextView.setAdapter(adapter);

        Gender_autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gender_autoCompleteTextView.showDropDown();
            }
        });
    }

    private static final String[] gender = new String[]{"men", "women", "not say"};
}
