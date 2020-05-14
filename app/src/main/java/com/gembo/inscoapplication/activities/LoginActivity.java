package com.gembo.inscoapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gembo.inscoapplication.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }
}
