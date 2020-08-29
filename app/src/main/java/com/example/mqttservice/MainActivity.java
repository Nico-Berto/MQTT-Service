package com.example.mqttservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etn, etp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.txt_password);
    }

    public void Ingresar(View view){

        String nombre = etn.getText().toString();
        String password = etp.getText().toString();

        if(nombre.length() == 0){
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_LONG).show();
        }
        if(password.length() == 0){
            Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show();
        }
        if (nombre.equals("Nico") && password.equals("1234")){
            Intent dashboard = new Intent(this, dashboard.class);
            startActivity(dashboard);
        }
        else
        {
             Toast.makeText(this, "Usuario Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}