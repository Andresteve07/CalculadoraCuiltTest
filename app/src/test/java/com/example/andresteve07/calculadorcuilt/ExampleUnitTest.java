package com.example.andresteve07.calculadorcuilt;

import org.junit.Test;

import rx.Observable;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        assertNotEquals(4,2+1);
    }

    @Test
    public void noSonIgual(){
        String hola1 = "hola";
        assertEquals("hola","hola");
        int arreglo [] ={5,9,33};
        assertNotEquals(arreglo,hola1);

    }

    @Test
    public void esVacio() {
        String palabra=null;
        assertNull(palabra);
    }
    @Test
    public void MismoObjecto(){
        Object objeto = new Object();
        Object objeto2 = new Object();
        assertNotSame(objeto,objeto2);
        assertFalse(true==false);
    }


    @Test
    public void errorThrown_isCorrect(){
        Observable.error(new RuntimeException("Hack!"))
                .test()
                .assertFailure(RuntimeException.class);
    }
}