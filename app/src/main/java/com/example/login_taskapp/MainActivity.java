package com.example.login_taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_account_create,main_Sign_in_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn_account_create=(Button)findViewById(R.id.btn_account_create);
       main_Sign_in_Btn=(Button)findViewById(R.id.Main_SignIn_btn);

       main_Sign_in_Btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in =new Intent(MainActivity.this,Sign_in_Activity.class);
               startActivity(in);
           }
       });
       btn_account_create.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent in = new Intent(MainActivity.this, Login_Activity.class);
               startActivity(in);

           }
       });


    }
}
