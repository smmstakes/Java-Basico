public class SmartTv {

    boolean ligada = false;
    int canal = 10;
    int volume = 16;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void subirCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }
}
