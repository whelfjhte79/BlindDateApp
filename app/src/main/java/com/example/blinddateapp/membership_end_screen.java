package com.example.blinddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class membership_end_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_end_screen);

        Button membership_home_in = (Button)findViewById(R.id.membership_home_go);
        membership_home_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent membership_home = new Intent(membership_end_screen.this, home.class);
                startActivity(membership_home);
            }
        });
    }
}