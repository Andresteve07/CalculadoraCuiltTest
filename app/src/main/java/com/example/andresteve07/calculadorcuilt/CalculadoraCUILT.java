package com.example.andresteve07.calculadorcuilt;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by andresteve07 on 18/09/18.
 */

public class CalculadoraCUILT {
    private GeneradorDeDNIyTipo generador;

    public CalculadoraCUILT(GeneradorDeDNIyTipo generador) {
        this.generador = generador;
    }

    public Observable<String> calcularCUILT(){
        return this.generador.generar()
                .toList()
                .map(new Func1<List<Integer>, String>() {
                    @Override
                    public String call(List<Integer> integers) {
                        return algoritmo(integers);
                    }
                });
    }

    public String algoritmo(List<Integer> enteros){
        return ""+enteros.get(0) + " -- " + enteros.get(1);
        //throw new RuntimeException("Hackeado!");
    }
}
