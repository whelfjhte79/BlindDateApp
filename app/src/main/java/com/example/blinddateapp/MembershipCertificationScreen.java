package com.example.blinddateapp;


import android.app.Activity;
import android.content.Intent;
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

        Button membership_membership2_in = (Button)findViewById(R.id.next_membership2);
        membership_membership2_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent membership_membership2 = new Intent(MembershipCertificationScreen.this, MembershipScreen.class);
                startActivity(membership_membership2);
            }
        });
    }
}
