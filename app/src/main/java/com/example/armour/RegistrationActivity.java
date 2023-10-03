package com.example.armour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ImageButton backBtn = findViewById(R.id.back_btn);

        backBtn.setOnClickListener(view -> {
            Intent intRegister = new Intent(RegistrationActivity.this,LoginActivity.class);
            startActivity(intRegister);
        });

        AppCompatButton startBtn = findViewById(R.id.startBtn);
        startBtn.setOnClickListener(view -> {
            Intent intRegister = new Intent(RegistrationActivity.this,MainActivity.class);
            startActivity(intRegister);
        });

        TextView txtlogin = findViewById(R.id.loginTxt);
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intRegisterTxt = new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intRegisterTxt);
            }
        });
    }
}