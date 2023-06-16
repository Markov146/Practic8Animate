package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    private ImageView imgView ;
    private Button startButton;
    private Button pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imgView = findViewById(R.id.animateView);
        startButton = findViewById(R.id.btnStart);
        pauseButton = findViewById(R.id.btnStop);

        Animation blinkAnimation = AnimationUtils.loadAnimation(this,R.anim.blink_animation);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.startAnimation(blinkAnimation);
            }
        });
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.clearAnimation();
            }
        });

    }
}