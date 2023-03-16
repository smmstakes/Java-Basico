package br.edu.dio.exercicios;

import java.util.Scanner;

public class Ex02_Nota{

    // Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        while(true){
            System.out.println("Digite uma nota: ");
            nota = scanner.nextInt();

            if (0 <= nota && nota <= 10){
                System.out.println("Nota obtida, obrigado!");
                break;
            }
            else System.out.println("Por favor, digite uma nota válida.");
        }

    }
}