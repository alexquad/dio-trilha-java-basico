package edu.alexandre.navegador;

public class NavegadorWeb {
    private void exibirPagina(){
        System.out.println("Exibindo página...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página...");
        exibirPagina();
    }

    public void adicionarNovaAba(String url){
        System.out.println("Adicionando nova aba com a url " + url + "...");
        exibirPagina();
    }
}
