public class SmartTv {
    int canal = 1;
    int volume = 10;
    boolean ligada = false;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }

    void diminuirVolume() {
        if (ligada) {
            volume--;
        }
    }

    void aumentarCanal() {
        if (ligada) {
            canal++;
        }
    }

    void diminuirCanal() {
        if (ligada) {
            canal--;
        }
    }
    
    void trocarCanal(int canal) {
        if (ligada) {
            this.canal = canal;
        }
    }
}
