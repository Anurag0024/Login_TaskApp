package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Upload_Document_Activity extends AppCompatActivity {
    Button upload_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload__document_);
        getSupportActionBar().setTitle("UPLOAD DOCUMENT");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        upload_btn=(Button)findViewById(R.id.upload_btn_id);
    }

    public void upload_btn(View v6){
        Intent  in = new Intent(Upload_Document_Activity.this,Complete_Signup.class);
        startActivity(in);
    }
}
