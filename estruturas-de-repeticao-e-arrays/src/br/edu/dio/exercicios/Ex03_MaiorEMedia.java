package br.edu.dio.exercicios;

import java.util.Scanner;

// Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        double maior_num = Double.NEGATIVE_INFINITY;
        int inteiro_maior = (int) maior_num;
        int count = 0;
        int media = 0;

        do{
            System.out.println("Digite um número: ");
            numero= scanner.nextInt();

            if (numero >= inteiro_maior) inteiro_maior = numero;
            
            media = media + numero;

            count++;
        }while(count < 5);

        System.out.println("O maior número é: " + inteiro_maior);
        System.out.println("A média destes números é: " + (media/5));
    }
    
}
