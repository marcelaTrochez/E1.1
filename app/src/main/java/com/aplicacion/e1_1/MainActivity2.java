package com.aplicacion.e1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       // txtResultado=(EditText) findViewById(R.id.txtResultado);
      //  txtResultado.setText(getIntent().getExtras().getString("Suma"));

    }
}