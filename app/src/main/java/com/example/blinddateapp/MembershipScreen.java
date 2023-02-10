package com.example.blinddateapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.URL;


public class MembershipScreen extends AppCompatActivity {

    private static String IP_ADDRESS = "ubuntu@ec2-3-35-54-91.ap-northeast-2.compute.amazonaws.com";
    private static String TAG = "blinddateapp";

    private EditText EditTextuser_id;
    private EditText EditTextuser_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_screen);

        EditTextuser_id = (EditText)findViewById(R.id.id_getinput_m);
        EditTextuser_pw = (EditText)findViewById(R.id.password_getinput_m);


        Button buttonInsert = (Button)findViewById(R.id.next_membership3);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user_id = EditTextuser_id.getText().toString();
                String user_pw = EditTextuser_pw.getText().toString();

                InsertData task = new InsertData();
                task.execute("http://" + IP_ADDRESS + "/inset.php", user_id,user_pw);


                EditTextuser_id.setText("");
                EditTextuser_pw.setText("");

            }
        });

//        Button membership_membership3_in = (Button)findViewById(R.id.next_membership3);
//        membership_membership3_in.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(MainActivity.this, "Login",Toast.LENGTH_LONG).show();
//
//                Intent membership_membership3 = new Intent(MembershipScreen.this, MembershipCameraScreen.class);
//                startActivity(membership_membership3);
//            }
//        });
    }



    class InsertData extends AsyncTask<String, Void, String>{
        ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(MembershipScreen.this,
                    "Please Wait", null, true, true);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            progressDialog.dismiss();
            Log.d(TAG, "POST response  - " + result);
        }

        @Override
        protected String doInBackground(String... params) {

            String user_id = (String)params[1];
            String user_pw = (String)params[2];

            String serverURL = (String)params[0];
            String postParameters = "user_id=" + user_id + "&user_pw=" + user_pw;


            try {

                URL url = new URL(serverURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.connect();


                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(postParameters.getBytes("UTF-8"));
                outputStream.flush();
                outputStream.close();


                int responseStatusCode = httpURLConnection.getResponseCode();
                Log.d(TAG, "POST response code - " + responseStatusCode);

                InputStream inputStream;
                if(responseStatusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = httpURLConnection.getInputStream();
                }
                else{
                    inputStream = httpURLConnection.getErrorStream();
                }


                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();
                String line = null;

                while((line = bufferedReader.readLine()) != null){
                    sb.append(line);
                }


                bufferedReader.close();


                return sb.toString();


            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);

                return new String("Error: " + e.getMessage());
            }

        }
    }

}