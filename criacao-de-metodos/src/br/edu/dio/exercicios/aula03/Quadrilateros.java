package br.edu.dio.exercicios.aula03;

public class Quadrilateros {

    public static double area(double lado){

        return (lado * lado);
    }

    public static double area(double lado1, double lado2){

        return (lado1 * lado2);
    }

    public static double area(double baseMaior, double baseMenor, double altura){

        return (((baseMaior + baseMenor)/2) * altura);
    }
    
    public static float area(float diagonalMaior, float diagonalMenor){

        return ((diagonalMaior * diagonalMenor)/2);
    }
    
}
