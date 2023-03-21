package br.edu.dio.exercicios.aula01;

public class Mensagens {

    public static void horaMensagem(int hora){

        if (hora >= 6 && hora < 12){
            System.out.println("Muito Bom Dia!!!\n:D\n");
        }

        else if(hora >= 12 && hora < 18) {
            System.out.println("Muito Boa Tarde!!!\n;D\n");
        }

        else if((hora >= 18 && hora <= 23) || (hora >= 0 && hora < 6)){
            System.out.println("Muito Boa Noite!!!\n:)\n");
        }

        else System.out.println("Hora Inválida");
    }
    
}
