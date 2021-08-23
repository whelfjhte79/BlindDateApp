package com.example.bilnddateapp;

import android.app.Activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class RandomMatchingActivity extends Activity{

    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_matching_page);

        btn_sub = findViewById(R.id.button_test);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
