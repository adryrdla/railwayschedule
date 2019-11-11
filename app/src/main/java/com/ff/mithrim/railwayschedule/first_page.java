package com.ff.mithrim.railwayschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class first_page extends AppCompatActivity {

    Animation fade_in;
    ImageView app_iconTrain;
    TextView textOpening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        app_iconTrain =findViewById(R.id.iconTrain);
        textOpening = findViewById(R.id.textOpening);

        app_iconTrain.startAnimation(fade_in);
        textOpening.startAnimation(fade_in);

        Handler delay = new Handler();
        delay.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent getstarted = new Intent(first_page.this, MainActivity.class);
                startActivity(getstarted);
                finish();
            }
        }, 3000);
    }
}
