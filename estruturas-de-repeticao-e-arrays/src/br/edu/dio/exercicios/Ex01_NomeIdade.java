package br.edu.dio.exercicios;

import java.util.Scanner;

// Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)

public class Ex01_NomeIdade{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idade;
    String nome;

    do{
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.next();

        if (nome.equals("0"))
            break;
        
        
        System.out.println("Digite a idade do aluno: ");
        idade = scanner.nextInt();

        if(idade < 0)
            System.out.println("Idade inválida! Por favor digite uma idade válida.");

        }while(idade >= 0);
    
    }
}