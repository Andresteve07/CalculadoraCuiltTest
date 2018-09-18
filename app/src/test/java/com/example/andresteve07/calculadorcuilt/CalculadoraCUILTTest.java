package com.example.andresteve07.calculadorcuilt;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import rx.Observable;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by andresteve07 on 18/09/18.
 */
public class CalculadoraCUILTTest {
    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock GeneradorDeDNIyTipo mockGenerador;

    @InjectMocks CalculadoraCUILT calculadora;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCalcularCUILT__hardcoded(){
        when(mockGenerador.generar()).thenReturn(Observable.just(null,456));
        calculadora.calcularCUILT()
            .test()
            .assertResult("12663 -- 456");
    }

}