package br.edu.dio.exercicios.arrays;

import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex01_OrdemInversa {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorNum = new int[6];

        for (int id = 0; id < vetorNum.length; id ++){
            System.out.printf("Insira o número da posição %d: %n", id);
            vetorNum[id] = scan.nextInt();
        }

        System.out.println("O vetor possui os valores: ");
        for (int id = vetorNum.length -1;id >= 0; id--){
            System.out.print(vetorNum[id] + " ");
        }
        scan.close();

    }
    
}
