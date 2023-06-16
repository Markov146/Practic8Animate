package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView ;
    private Button startBtn;
    private Button pauseBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = findViewById(R.id.imageView);
        startBtn = findViewById(R.id.buttonStart);
        pauseBtn = findViewById(R.id.buttonStop);

        AnimationDrawable animationDraw = (AnimationDrawable) imageView.getDrawable();
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                animationDraw.start();
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                animationDraw.stop();
            }
        });


    }
}
