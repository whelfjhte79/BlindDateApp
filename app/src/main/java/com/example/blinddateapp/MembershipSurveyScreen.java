package com.example.blinddateapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembershipSurveyScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_survey_screen);

        Button membership_membership5_in = (Button)findViewById(R.id.next_membership5);
        membership_membership5_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent membership_membership5 = new Intent(MembershipSurveyScreen.this, membership_end_screen.class);
                startActivity(membership_membership5);
            }
        });
    }
}
