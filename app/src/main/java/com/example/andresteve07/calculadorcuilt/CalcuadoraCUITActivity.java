package com.example.andresteve07.calculadorcuilt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import rx.Subscriber;

public class CalcuadoraCUITActivity extends AppCompatActivity {
    private CalculadoraCUILT calculadora;
    private TextView resultado;
    private Button botonCUIT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcuadora_cuit);
        this.calculadora = new CalculadoraCUILT(new GeneradorDeDNIyTipo(new Random()));
        this.resultado = findViewById(R.id.resultado_cuilt);
        this.botonCUIT = findViewById(R.id.botoncito);

        botonCUIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculadora.calcularCUILT()
                        .subscribe(new Subscriber<String>() {
                            @Override
                            public void onCompleted() {
                                Log.d("CALCULADORA", "COMPETADO!!");
                            }

                            @Override
                            public void onError(Throwable e) {
                                resultado.setText(e.getMessage());
                            }

                            @Override
                            public void onNext(String s) {
                                resultado.setText(s);
                            }
                        });
            }
        });

    }
}
