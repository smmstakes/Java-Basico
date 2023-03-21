package br.edu.dio.exercicios.aula02;

// Faça um metodo que retorne areas de diversos quadrilateros

public class Quadrilatero {

    public static void area(double lado){

        System.out.printf("Área do Quadrado: %.2f%n", (lado * lado));
    }

    public static void area(double lado1, double lado2){

        System.out.printf("Área do Retângulo: %.2f%n", (lado1 * lado2));
    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.printf("Área do Trapézio: %.2f%n", (((baseMaior + baseMenor)/2) * altura));
    }
    
    public static void area(float diagonalMaior, float diagonalMenor){

        System.out.printf("Área do Losango: %.2f%n", ((diagonalMaior * diagonalMenor)/2));
    }
}
