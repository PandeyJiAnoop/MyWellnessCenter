package com.akp.mywellnesscenter.IntroPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akp.mywellnesscenter.R;

public class GetStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_start);
        Button get_started_btn = findViewById(R.id.get_started_btn);
        get_started_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), IntroStep1.class);
                startActivity(intent);
            }
        });
    }
}