package br.edu.dio.exercicios.arrays;

import java.util.Random;
import java.util.Arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class Ex04_ArrayMultidimensional {

    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = aleatorio.nextInt(9);
            }
        }

        System.out.println(Arrays.deepToString(matriz));

    }
    
}
