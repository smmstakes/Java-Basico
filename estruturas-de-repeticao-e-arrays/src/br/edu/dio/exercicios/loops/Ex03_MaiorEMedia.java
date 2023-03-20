package br.edu.dio.exercicios.loops;

import java.util.Scanner;

// Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        double maiorNum = Double.NEGATIVE_INFINITY;
        int inteiroMaior = (int) maiorNum;
        int count = 0;
        int media = 0;

        do{
            System.out.println("Digite um número: ");
            numero= scanner.nextInt();

            if (numero >= inteiroMaior) inteiroMaior = numero;
            
            media = media + numero;

            count++;
        }while(count < 5);

        scanner.close();

        System.out.println("O maior número é: " + inteiroMaior);
        System.out.println("A média destes números é: " + (media/5));
    }
    
}
