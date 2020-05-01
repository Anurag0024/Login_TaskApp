package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Upload_Document_Activity extends AppCompatActivity {
    Button upload_nxt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload__document_);
        getSupportActionBar().setTitle("UPLOAD DOCUMENT");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        upload_nxt_btn=(Button)findViewById(R.id.upload_next_btn);
        upload_nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  in = new Intent(Upload_Document_Activity.this,Complete_Signup.class);
                startActivity(in);
            }
        });
    }
}
