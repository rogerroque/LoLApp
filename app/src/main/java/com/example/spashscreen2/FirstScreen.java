package com.example.spashscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.spashscreen2.databinding.ActivityFirstScreenBinding;

public class FirstScreen extends AppCompatActivity {

    private ActivityFirstScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityFirstScreenBinding.inflate(getLayoutInflater())).getRoot());
        /*setContentView(R.layout.activity_first_screen);*/

        binding.BotonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreen.this, LoginActivity.class));
            }
        });

        binding.BotonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreen.this, SignupActivity.class));
            }
        });

    }
}