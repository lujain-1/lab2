package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {


    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        receiver_msg=(TextView)findViewById(R.id.received_value_id);
        Intent intent=getIntent();

        receiver_msg.setText("Hello, "+intent.getStringExtra("message_key")+"!");


    }
}