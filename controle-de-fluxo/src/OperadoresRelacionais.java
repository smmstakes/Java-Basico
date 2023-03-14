
public class OperadoresRelacionais {
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 15;

        double num3 = 17.9;
        double num4 = 61.5;

        String nome1 = "Andre";
        String nome2 = "André";

        System.out.println(num1 < num2); //True
        System.out.println(num2 == num1); //False

        System.out.println(num3 != num4); //True
        System.out.println(num3 >= num4); //False

        System.out.println(nome1.equals(nome2)); //False

    }
}
