package com.example.indianfooder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
    }

    public void changeToRegistro(View view){
        Intent nIntent = new Intent(Acceso.this,Registro.class);
        startActivity(nIntent);
    }
    public void changeToMain(View view){
        Intent nIntent = new Intent(Acceso.this,Main.class);
        startActivity(nIntent);
    }
}