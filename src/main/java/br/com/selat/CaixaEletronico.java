package br.com.selat;

import java.util.Scanner;
import java.util.TreeMap;

class CaixaEletronico {

    public TreeMap<Integer, Integer> calculaNotas(int[] notas, int valor){
        TreeMap<Integer, Integer> totalNotas = new TreeMap<>();
        int valorFaltante = valor;
        for (int nota : notas){
            int quantidadeNota = valorFaltante / nota;
            valorFaltante-=quantidadeNota * nota;
            totalNotas.put(nota, quantidadeNota);
        }
        return totalNotas;
    }

    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        int[] notas = {100, 50, 20, 10};

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        int valor = input.nextInt();

        if (valor % 10 != 0){
            System.out.println("Valor incorreto. Utilize valor múltiplo de 10");
            System.exit(1);
        }

        TreeMap<Integer, Integer> resultado = caixaEletronico.calculaNotas(notas, valor);
        for(Integer nota : resultado.descendingKeySet()){
            int quantidadeNota = resultado.get(nota);
            if (quantidadeNota > 0){
                System.out.println(quantidadeNota + " nota" + (quantidadeNota>1?"s":"") + " de R$ " + nota);
            }
        }
        input.close();
    }
}