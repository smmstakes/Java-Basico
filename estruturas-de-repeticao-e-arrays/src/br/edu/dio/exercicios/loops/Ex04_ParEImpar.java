package br.edu.dio.exercicios.loops;

import java.util.Scanner;

// Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.

public class Ex04_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroLido;
        int qtdNumeros;
        int numPar = 0;
        int numImpar = 0;

        System.out.println("Digite a quantidade de números a serem analisados: ");
        qtdNumeros = scan.nextInt();

        do{ 
            System.out.println("Digite um número: ");
            numeroLido = scan.nextInt();

            if((numeroLido % 2) == 0) numPar++;
            else numImpar++;

            qtdNumeros--;
        }while (qtdNumeros != 0);

        scan.close();

        System.out.printf("Houve %d números pares.%n", numPar);
        System.out.printf("Houve %d númeors impares.%n", numImpar);

    }
    
}
