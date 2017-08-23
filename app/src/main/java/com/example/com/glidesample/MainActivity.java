package com.example.com.glidesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imgUrl = "https://upload.wikimedia.org/wikipedia/en/1/17/Batman-BenAffleck.jpg";

        ImageView imageView = (ImageView) findViewById(R.id.image);

        Glide.with(MainActivity.this).load(imgUrl)
                .thumbnail(0.5f)
                .placeholder(R.drawable.splash_background_pic)
                .crossFade()
                .into(imageView);
    }
}
