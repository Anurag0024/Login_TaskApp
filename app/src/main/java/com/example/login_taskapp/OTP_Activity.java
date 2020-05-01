package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OTP_Activity extends AppCompatActivity {
    Button Confirm_otp_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_);
        getSupportActionBar().setTitle("ENTER OTP");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Confirm_otp_btn=(Button)findViewById(R.id.Confirm_btn_otp);
        Confirm_otp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(OTP_Activity.this,Business_Detail_Activity.class);
                startActivity(in);
            }
        });

    }
}
