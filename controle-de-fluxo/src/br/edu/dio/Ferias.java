package br.edu.dio;
import java.util.Scanner;

public class Ferias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva o mês que está para saber se é férias ou não: ");
        String mes = scanner.next();

        if ("Janeiro".equals(mes) || "Julho".equals(mes) || "Dezembro".equals(mes))
            System.out.println("Parabéns, você está de Férias.\n:)");
        
        else
            System.out.println("Não está de Férias.\n:(");

    }
    
}
