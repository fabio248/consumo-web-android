package com.example.consumows1fm19038.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import com.example.consumows1fm19038.Controllers.Controlador;
import com.example.consumows1fm19038.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanzarActividad(View v){
        Intent i = null;
        switch(v.getId()){
            case R.id.button_materia:
                i = new Intent(this,ActualizarActivity.class);
                break;
            case R.id.button_alumno:
                i = new Intent(this,PromedioActivity.class);
                break;
            case R.id.button_nota:
                i = new Intent(this,IngresarActivity.class);
                break;
        }
        if(i!=null)
            startActivity(i);
    }
}

