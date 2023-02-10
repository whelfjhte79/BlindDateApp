package com.example.blinddateapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembershipCameraScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membship_camera_screen);

        Button membership_membership4_in = (Button)findViewById(R.id.next_membership4);
        membership_membership4_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent membership_membership4 = new Intent(MembershipCameraScreen.this, MembershipSurveyScreen.class);
                startActivity(membership_membership4);
            }
        });
    }
}
