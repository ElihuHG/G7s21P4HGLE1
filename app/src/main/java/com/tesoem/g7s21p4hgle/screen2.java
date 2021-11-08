package com.tesoem.g7s21p4hgle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class screen2 extends AppCompatActivity {
    TextView textCon;
    Button btnv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

         textCon = findViewById(R.id.textCon);
         btnv = findViewById(R.id.btnv);



    }

    public void onClick(View v){

        String contra = textCon.getText().toString();
        String contrasena = "Android2021";
        if(contrasena.equals(contra)) {
            Toast.makeText(this, "Contraseña correcta", Toast.LENGTH_SHORT).show();

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(screen2.this,screen3.class ));

                }
            };

            Handler h = new Handler();
            h.postDelayed(r,10);


        }else {

            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
            finish();
            System.exit(1);


        }

    }
}