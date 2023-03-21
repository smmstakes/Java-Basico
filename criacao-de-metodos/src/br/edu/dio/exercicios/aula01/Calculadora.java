package br.edu.dio.exercicios.aula01;

// Calcule as 4 operações básicas,  com 2 valores de referencia

public class Calculadora {

    static final String espacamento = "================================================";

    public static void somar(double num1, double num2){

        double soma = num1 + num2;

        System.out.printf("A soma de %.2f com %.2f é igual a: %.2f %n", num1, num2, soma);
        System.out.println(espacamento);
    }


    public static void subtrair(double num1, double num2){

        double subtracao = num1 - num2;

        System.out.printf("A subtração de %.2f com %.2f é igual a: %.2f %n", num1, num2, subtracao);
        System.out.println(espacamento);

    }


    public static void multiplicar(double num1, double num2){

        double multiplicacao = num1 * num2;

        System.out.printf("A multiplicação de %.2f com %.2f é igual a: %.2f %n", num1, num2, multiplicacao);
        System.out.println(espacamento);

    }


    public static void dividir(double num1, double num2){

        double divisao = num1 / num2;

        System.out.printf("A divisão de %.2f com %.2f é igual a: %.2f %n", num1, num2, divisao);
        System.out.println(espacamento);

    }
    
}
