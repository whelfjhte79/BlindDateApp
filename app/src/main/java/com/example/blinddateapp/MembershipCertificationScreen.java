package com.example.blinddateapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembershipCertificationScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_certification_screen);

        Button mainin = (Button) findViewById(R.id.go_back_membership);
        mainin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
