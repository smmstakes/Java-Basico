package br.edu.dio.exercicios.arrays;

import java.util.Random;
import java.util.Arrays;

/*
    Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final mostre os números.
*/

public class Ex03_NumerosAleatorios {

    public static void main(String[] args) {

        Random aleatorio = new Random();        
        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++){
            numAleatorios[i] = aleatorio.nextInt(100);
        }

        System.out.println(Arrays.toString(numAleatorios));

    }
    
}
