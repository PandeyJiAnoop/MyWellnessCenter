package com.akp.mywellnesscenter.IntroPage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.akp.mywellnesscenter.R;

public class IntroStep1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_step1);
        AppCompatButton next_btn = findViewById(R.id.next_btn);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), IntroStep2.class);
                startActivity(intent);
            }
        });
    }
}