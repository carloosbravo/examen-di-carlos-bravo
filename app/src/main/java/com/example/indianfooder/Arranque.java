package com.example.indianfooder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class Arranque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);
        openAcceso();

        ImageView logoSplash = findViewById(R.id.logoSplash);
        Animation zoomInAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom_in);

        logoSplash.startAnimation(zoomInAnimation);

        ImageView background = findViewById(R.id.backgroundSplash);
        RequestBuilder<Drawable> a = Glide.with(this).load("https://images.unsplash.com/photo-1580689376629-2c4ef0920e79?q=80&w=1939&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");

        a.centerCrop().into(background);
        a.transform(new BlurTransformation( 20, 2)).centerCrop().into(background);

        a.transform(new CenterCrop(), new BlurTransformation(20, 2));
    }

    public void openAcceso() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, Acceso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 3000);
    }
}