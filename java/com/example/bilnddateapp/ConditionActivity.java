package com.example.bilnddateapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class ConditionActivity extends AppCompatActivity {
    private Button deepRecommendedSearchButton;
    private Button randomMatchingButton;
    private Button findIdealButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.condition_search_page);

        deepRecommendedSearchButton = findViewById(R.id.btn_deep_recommended_search);
        randomMatchingButton = findViewById(R.id.btn_random_matching);
        findIdealButton = findViewById(R.id.btn_find_ideal);

        deepRecommendedSearchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ConditionActivity.this, DeepLearningRecommendedSearchActivity.class);
                startActivity(intent);
            }
        });
        randomMatchingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ConditionActivity.this, RandomMatchingActivity.class);
                startActivity(intent);
            }
        });
        findIdealButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ConditionActivity.this, FindIdealActivity.class);
                startActivity(intent);
            }
        });
    }

}
