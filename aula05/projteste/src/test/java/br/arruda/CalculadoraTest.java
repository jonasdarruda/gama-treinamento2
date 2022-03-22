package br.arruda;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora c;

    @BeforeEach
    public void setup(){
        c = new Calculadora();
    }

    
    @Test
    public void devRetornarASomaDosValores() {
        

        double resultado = c.somar(10, 20);

        assertEquals( 30, resultado);
    }
    @Test
    public void deveRetornarASubtracaoDosNumeros(){
        

        double resultado = c.subtrair(20, 10);
        assertEquals(10, resultado);

    }

    @Test
    public void deveRetornarAMultiplicaoDosNumeros(){
        double resultado = c.multiplicar(2, 10);
        assertEquals(20, resultado);


    }

    @Test
    public void deveRetornarADivisaoQuandoDenominadorDiferenteZero(){
        double resultado = c.dividir(20, 5);
        assertEquals(4, resultado);

    }

    @Test
    public void deveRetornarNegativoQuandoDenominadorZero(){
        double resultado = c.dividir(20, 0);
        assertEquals(-1, resultado);
    }
}