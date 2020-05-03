package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Sign_up_Create_account extends AppCompatActivity {
    Button nxt_btn_create;
    TextView login_here_tv;
    RadioGroup radioGroup;
    RadioButton radio_individual,radio_business;
    ArrayAdapter<CharSequence> adapter;
    AutoCompleteTextView country_autofill_tv;
    private static final String[] countries = new String[]{"india", "Dubai", "pakistan", "america"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__create_account);

        getSupportActionBar().setTitle("SIGN UP");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nxt_btn_create=(Button)findViewById(R.id.nxt_btn_create_id);
        login_here_tv=(TextView)findViewById(R.id.login_here_tv_id);
        country_autofill_tv  = (AutoCompleteTextView) findViewById(R.id.country_autofill_tvi_d);
        radioGroup=(RadioGroup)findViewById(R.id.radio_group_login);
        radio_business=(RadioButton)findViewById(R.id.business_radio_id);
        radio_individual=(RadioButton)findViewById(R.id.individual_radio_id);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        country_autofill_tv.setAdapter(adapter);
        country_autofill_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                country_autofill_tv.showDropDown();
            }
        });

    }
    public void btn_next(View V1){
        Intent in= new Intent (Sign_up_Create_account.this,OTP_Activity.class);
        startActivity(in);
    }
    public void login_here(View V2){
        Intent in= new Intent (Sign_up_Create_account.this,Sign_in_Activity.class);
        startActivity(in);
    }
    public void check_button_individual(View V3){
        nxt_btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent in=new Intent(Sign_up_Create_account.this,OTP_Activity.class);
             startActivity(in);
            }
        });


    }
    public void check_button_business(View V4){
        nxt_btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Sign_up_Create_account.this,Business_Detail_Activity.class);
                startActivity(in);
            }
        });

    }



    }
