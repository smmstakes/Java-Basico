package br.edu.dio.exercicios.loops;

import java.util.Scanner;

// Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

public class Ex05_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número que deseja saber a tabuada: ");
        numero = scan.nextInt();
        
        System.out.println("\nTabuada do " + numero);
        for (int n = 1; n <=10; n++){
            System.out.printf("%d x %d = %d %n", numero, n, (numero * n));
        }

        scan.close();
        
    }
    
}
