package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button= findViewById(R.id.send_button);
        send_text=findViewById(R.id.send_text);

        send_button.setOnClickListener(v -> {


            String str = send_text.getText().toString();

            Intent intent = new Intent(getApplicationContext(),secondActivity.class);
            intent.putExtra("message_key",   send_text.getText().toString());
            startActivity(intent);
        });
    }
}
















