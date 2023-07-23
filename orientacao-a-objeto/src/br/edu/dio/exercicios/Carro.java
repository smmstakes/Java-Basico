package br.edu.dio.exercicios;

public class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtores

    Carro(){
    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        //this.atributo = parametro
    }

    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }


    //Método para calcular o valor
    double totalValorTanque(double combustivel){
        return capacidadeTanque * combustivel;
    }
    
    
}

