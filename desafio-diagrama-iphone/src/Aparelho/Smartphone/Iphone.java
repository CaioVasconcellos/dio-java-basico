package Aparelho.Smartphone;

import Aparelho.Funcoes.Internet.NavegadorDeInternet;
import Aparelho.Funcoes.Musica.ReprodutorMusical;
import Aparelho.Funcoes.Telefone.AparelhoTelefonico;

public class Iphone implements NavegadorDeInternet, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página no Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no Iphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando no Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no Iphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");

    }
}
