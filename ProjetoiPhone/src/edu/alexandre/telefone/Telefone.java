package edu.alexandre.telefone;

public class Telefone {
    
    private void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }
    
    private boolean naoAtendeu(){
        // Simula se o telefone não atendeu, aleatorio, 1 em 3.
        return (Math.random() * 3) > 2;
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        if (naoAtendeu()) {
            iniciarCorreioVoz();
        }
    }

    public void desligar() {
        System.out.println("Desligando...");
    }
}
