package com.example.appwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    EditText user,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user=findViewById(R.id.usuario);
        pass=findViewById(R.id.contrasena);
        btndig=findViewById(R.id.digital);
        btnoffs=findViewById(R.id.offset);
        btnsta=findViewById(R.id.stands);



    }
}
