package br.edu.dio.exercicios.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex02_Consoantes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int qtdConsoantes = 0;
        String[] vetorConsoantes = new String[5];

        for (int id = 0; id < vetorConsoantes.length;id++){
            System.out.println("Digite aqui uma letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                vetorConsoantes[id] = letra;
                qtdConsoantes++;
                }
            }

            System.out.printf("Foram informadas %d consoantes.%n",qtdConsoantes);
            System.out.print("Sendo as consoantes: ");
            for (String consoante : vetorConsoantes){
                if(consoante != null) System.out.print(consoante + " ");
            }
       
        scan.close();
    }
    
}
