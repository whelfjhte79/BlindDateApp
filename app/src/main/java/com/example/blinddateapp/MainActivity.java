package com.example.blinddateapp;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button membershipBT = (Button)findViewById(R.id.membership_button);
        membershipBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent membershipin = new Intent(MainActivity.this, MembershipCertificationScreen.class);
                startActivity(membershipin);
            }
        });

    }
}

