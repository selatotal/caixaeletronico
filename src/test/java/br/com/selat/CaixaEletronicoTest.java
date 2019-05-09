package br.com.selat;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaixaEletronicoTest {

    private static final CaixaEletronico caixaEletronico = new CaixaEletronico();
    private static final int[] notas = {100, 50, 20, 10};

    @Test
    void test30Value(){
        TreeMap<Integer, Integer> result = caixaEletronico.calculaNotas(notas, 30);
        assertEquals(0, result.get(100).intValue());
        assertEquals(0, result.get(50).intValue());
        assertEquals(1, result.get(20).intValue());
        assertEquals(1, result.get(10).intValue());
    }

    @Test
    void test80Value(){
        TreeMap<Integer, Integer> result = caixaEletronico.calculaNotas(notas, 80);
        assertEquals(0, result.get(100).intValue());
        assertEquals(1, result.get(50).intValue());
        assertEquals(1, result.get(20).intValue());
        assertEquals(1, result.get(10).intValue());
    }

    @Test
    void test100Value(){
        TreeMap<Integer, Integer> result = caixaEletronico.calculaNotas(notas, 100);
        assertEquals(1, result.get(100).intValue());
        assertEquals(0, result.get(50).intValue());
        assertEquals(0, result.get(20).intValue());
        assertEquals(0, result.get(10).intValue());
    }

    @Test
    void testZeroValue(){
        TreeMap<Integer, Integer> result = caixaEletronico.calculaNotas(notas, 0);
        assertEquals(0, result.get(100).intValue());
        assertEquals(0, result.get(50).intValue());
        assertEquals(0, result.get(20).intValue());
        assertEquals(0, result.get(10).intValue());
    }

}
