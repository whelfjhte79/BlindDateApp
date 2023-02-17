package com.example.blinddateapp;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private EditText et_id, et_pass;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //로그인 시 아이디, 패스워드 확인
//        final EditText login_id = (EditText) findViewById(R.id.id_getinput);
//        final EditText login_password = (EditText) findViewById(R.id.password_getinput);

        et_id = findViewById(R.id.id_getinput);
        et_pass = findViewById(R.id.password_getinput);
        btn_login = findViewById(R.id.login_button);

        Button login_check = (Button)findViewById(R.id.login_button);
        login_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st_login_id = et_id.getText().toString();
                String st_login_password = et_pass.getText().toString();

                if(st_login_id.isEmpty()){
                    Toast.makeText(MainActivity.this, "please insert id", Toast.LENGTH_LONG).show();
                    return;
                }
                if(st_login_password.isEmpty()){
                    Toast.makeText(MainActivity.this, "please insert password", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });

        //회원가입 페이지 이동
        Button login_membership_in = (Button)findViewById(R.id.membership_button);
        login_membership_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();

                Intent login_membership = new Intent(MainActivity.this, MembershipCertificationScreen.class);
                startActivity(login_membership);
            }
        });

//        //로그인 후 홈 화면으로 이동
//        Button login_home_in = (Button)findViewById(R.id.login_button);
//        login_home_in.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();
//
//                Intent login_home = new Intent(MainActivity.this, home.class);
//                startActivity(login_home);
//            }
//        });


    }
}

