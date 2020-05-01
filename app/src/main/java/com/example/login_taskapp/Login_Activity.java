package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {
    Button Next_Button_Act;
    TextView Login_here_txtView;
    ArrayAdapter<CharSequence> adapter;
    AutoCompleteTextView Country_autoCompleteTextView;

    private static final String[] countries = new String[]{"india", "Dubai", "pakistan", "america"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        //==========================================//
            getSupportActionBar().setTitle("SIGN UP");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            Next_Button_Act=(Button)findViewById(R.id.Next_Button_Login);
            Login_here_txtView=(TextView)findViewById(R.id.Login_Here_txtView);
            Country_autoCompleteTextView  = (AutoCompleteTextView) findViewById(R.id.Country_Autofill);


        Login_here_txtView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(Login_Activity.this,Business_Detail_Activity.class);
                    startActivity(in);
                }
            });
            Next_Button_Act.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in= new Intent(Login_Activity.this,Fill_Details_Activity.class);
                    startActivity(in);
                }
            });

            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,countries);
        Country_autoCompleteTextView.setAdapter(adapter);

        Country_autoCompleteTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Country_autoCompleteTextView.showDropDown();
                }
            });

        }
    }


