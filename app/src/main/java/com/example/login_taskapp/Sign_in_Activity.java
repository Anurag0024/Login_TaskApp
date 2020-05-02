package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_in_Activity extends AppCompatActivity {
    TextView create_one_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
        getSupportActionBar().setTitle("LOGIN");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void create_One(View V6){
        Intent in = new Intent(Sign_in_Activity.this,Sign_up_Create_account.class);
        startActivity(in);
    }
}
