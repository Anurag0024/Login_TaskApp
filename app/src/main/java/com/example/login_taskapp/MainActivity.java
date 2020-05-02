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
       btn_account_create=(Button)findViewById(R.id.account_create_btn_id);
       main_Sign_in_Btn=(Button)findViewById(R.id.main_sign_btn_id);
    }

    public void clicksign(View V1){
        Intent in= new Intent (MainActivity.this,Sign_in_Activity.class);
        startActivity(in);
    }
    public void create_account(View V2){
        Intent in= new Intent (MainActivity.this,Sign_up_Create_account.class);
        startActivity(in);
    }
}
