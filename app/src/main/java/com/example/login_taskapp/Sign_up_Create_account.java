package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class Sign_up_Create_account extends AppCompatActivity {
    Button nxt_btn_create;
    TextView login_here_tv;
    ArrayAdapter<CharSequence> adapter;
    AutoCompleteTextView Country_autoCompleteTextView;
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
        Country_autoCompleteTextView  = (AutoCompleteTextView) findViewById(R.id.Country_Autofill);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        Country_autoCompleteTextView.setAdapter(adapter);

        Country_autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Country_autoCompleteTextView.showDropDown();
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


    }
