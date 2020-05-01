package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Complete_Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete__signup);
        getSupportActionBar().setTitle("SIGN UP COMPLETE");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
