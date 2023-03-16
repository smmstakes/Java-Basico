package br.edu.dio;
import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês: ");
        int numMes = scanner.nextInt();

        if (numMes == 1)
            System.out.println("Janeiro");
            
        else if (numMes == 2)
            System.out.println("Fevereiro");
        
        else if (numMes == 3)
            System.out.println("Março");
        
        else 
            System.out.println("Outros meses que não valem o trabalho manual");

    }
    
}
