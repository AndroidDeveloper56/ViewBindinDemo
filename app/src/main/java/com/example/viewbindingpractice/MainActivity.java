package com.example.viewbindingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.viewbindingpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        bind.button1.setText("Hello kailash");
        bind.button2.setText("welo come");
    }
}