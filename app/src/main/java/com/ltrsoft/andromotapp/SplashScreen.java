package com.ltrsoft.andromotapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.ltrsoft.andromotapp.fragment.Login;

public class SplashScreen extends AppCompatActivity {

    private static final long SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,
                        MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);

    }
}