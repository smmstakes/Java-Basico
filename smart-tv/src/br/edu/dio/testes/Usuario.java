public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.ligar();
        smartTv.diminuirCanal();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume da TV? " + smartTv.volume);
        System.out.println("Qual o canal da TV? " + smartTv.canal);

    }
}
