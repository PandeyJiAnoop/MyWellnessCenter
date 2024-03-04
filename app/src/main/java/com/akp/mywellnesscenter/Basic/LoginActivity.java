package com.akp.mywellnesscenter.Basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.akp.mywellnesscenter.MainActivity;
import com.akp.mywellnesscenter.R;

public class LoginActivity extends AppCompatActivity {
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findId();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void findId() {
        login=findViewById(R.id.bt_sign_in_google);

    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}