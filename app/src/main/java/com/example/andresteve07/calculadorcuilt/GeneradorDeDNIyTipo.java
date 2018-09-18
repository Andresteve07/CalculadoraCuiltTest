package com.example.andresteve07.calculadorcuilt;

import java.util.Random;

import rx.Observable;

/**
 * Created by andresteve07 on 18/09/18.
 */

public class GeneradorDeDNIyTipo {
    private Random generadorRandom;
    public GeneradorDeDNIyTipo(Random random) {
        this.generadorRandom = random;
    }
    public Observable<Integer> generar(){
        Integer tipo = this.generadorRandom.nextInt(3);
        Integer dni = this.generadorRandom.nextInt(20000000)+10000000;
        //return Observable.error(new Exception("Otro Hack!"))
        return Observable.just(tipo,dni);
    }
}
