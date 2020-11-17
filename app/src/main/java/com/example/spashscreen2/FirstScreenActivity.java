package com.example.spashscreen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.spashscreen2.databinding.ActivityFirstScreenBinding;

public class FirstScreenActivity extends AppCompatActivity {

    private ActivityFirstScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityFirstScreenBinding.inflate(getLayoutInflater())).getRoot());
        /*setContentView(R.layout.activity_first_screen);*/

        binding.BotonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreenActivity.this, LoginActivity.class));
            }
        });

        binding.BotonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstScreenActivity.this, SignupActivity.class));
            }
        });

    }
}