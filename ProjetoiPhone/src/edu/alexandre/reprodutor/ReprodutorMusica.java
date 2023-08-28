package edu.alexandre.reprodutor;

public class ReprodutorMusica {
    public void tocar(){
        System.out.println("Reproduzindo música...");
    }

    public void pausar(){
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Selecionando música " + musica + "...");
    }
}