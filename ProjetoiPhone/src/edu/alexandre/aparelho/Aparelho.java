package edu.alexandre.aparelho;

import edu.alexandre.navegador.NavegadorWeb;
import edu.alexandre.reprodutor.ReprodutorMusica;
import edu.alexandre.telefone.Telefone;

public class Aparelho {
    public static void main(String[] args) throws Exception {
        // Reprodutor de Música
        System.out.println("Reprodutor de Música");
        ReprodutorMusica reprodutor = new ReprodutorMusica();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Musica 1");

        // Telefone
        System.out.println("\n\nTelefone");
        Telefone telefone = new Telefone();
        telefone.ligar("123456789");
        telefone.desligar();

        // Navegador de Internet
        System.out.println("\n\nNavegador de Internet");
        NavegadorWeb navegador = new NavegadorWeb();
        navegador.adicionarNovaAba("https://www.google.com");
        navegador.atualizarPagina();
    }
}
