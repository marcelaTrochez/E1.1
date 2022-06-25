package com.aplicacion.e1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.function.Function;

public class MainActivity extends AppCompatActivity {
    EditText txtN1,txtN2,txtResult;
    Button btnSuma, btnResta, btnDividir, btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txtN1=(EditText) findViewById(R.id.txtN1);
            txtN2=(EditText) findViewById(R.id.txtN2);
            btnSuma=(Button) findViewById(R.id.btnSuma);
            btnResta=(Button) findViewById(R.id.btnResta);
            btnMultiplicar=(Button) findViewById(R.id.btnMultiplicar);
            btnDividir=(Button) findViewById(R.id.btnDividir);
            txtResult=(EditText) findViewById(R.id.txtResult);

            btnSuma.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    txtResult.setText(suma(Integer.parseInt(txtN1.getText().toString()),Integer.parseInt(txtN2.getText().toString()))+"");
                }
            });

            btnResta.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    txtResult.setText(resta(Integer.parseInt(txtN1.getText().toString()),Integer.parseInt(txtN2.getText().toString()))+"");
                }
            });

            btnMultiplicar.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    txtResult.setText(multiplicacion(Integer.parseInt(txtN1.getText().toString()),Integer.parseInt(txtN2.getText().toString()))+"");
                }
            });

            btnDividir.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View v) {
                    txtResult.setText(division(Integer.parseInt(txtN1.getText().toString()),Integer.parseInt(txtN2.getText().toString()))+"");
                }
            });
    }
    public double suma(int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}