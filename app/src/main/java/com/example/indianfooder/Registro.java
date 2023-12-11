package com.example.indianfooder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void changeToAcceso(View view){
        Intent nIntent = new Intent(Registro.this,Acceso.class);
        startActivity(nIntent);
    }
    public void mostrarToast(View view){
        Toast.makeText(Registro.this, "Regitro completado", Toast.LENGTH_SHORT).show();
    }

}