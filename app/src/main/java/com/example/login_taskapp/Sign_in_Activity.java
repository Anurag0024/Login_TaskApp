package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sign_in_Activity extends AppCompatActivity {
    TextView create_account_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);
        getSupportActionBar().setTitle("LOGIN");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        create_account_one=(TextView)findViewById(R.id.Create_Account_One_Sign_in);
        create_account_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Sign_in_Activity.this,Login_Activity.class);
                startActivity(in);
            }
        });
    }
}
