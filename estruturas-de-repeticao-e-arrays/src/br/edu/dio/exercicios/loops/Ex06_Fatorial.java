package br.edu.dio.exercicios.loops;

import java.util.Scanner;

// Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
// Ex.: 5! = 5.4.3.2.1 = 120

public class Ex06_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.println("Digite o número para saber o seu fatorial: ");
        numero = scan.nextInt();

        for(int n = numero; n >= 1; n--){
            fatorial = fatorial * n;
            System.out.println(fatorial);
        }

        scan.close();

        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
        
    }
    
}
