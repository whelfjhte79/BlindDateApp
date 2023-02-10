package com.example.blinddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button home_Matching_in = (Button)findViewById(R.id.home_Matching_go);
        home_Matching_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent home_Matching = new Intent(home.this, UserMatching.class);
                startActivity(home_Matching);
            }
        });

        Button home_chat_in = (Button)findViewById(R.id.home_chat_go);
        home_chat_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent home_chat = new Intent(home.this, UserMatching.class);
                startActivity(home_chat);
            }
        });

        Button home_setting_in = (Button)findViewById(R.id.home_setting_go);
        home_setting_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent home_setting = new Intent(home.this, setting.class);
                startActivity(home_setting);
            }
        });
    }

}