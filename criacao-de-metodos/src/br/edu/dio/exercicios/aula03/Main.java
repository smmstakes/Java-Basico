package br.edu.dio.exercicios.aula03;

public class Main{

    public static void main(String[] args) {

        System.out.println("Área do Quadrado = " + Quadrilateros.area(5));
        System.out.println("Área do Retângulo = " + Quadrilateros.area(7.5d, 4.5d));
        System.out.println("Área do Trapézio = " + Quadrilateros.area(10, 5, 4));
        System.out.println("Área do Losango = " + Quadrilateros.area(15f, 10f));
        
    }
}