package br.com.gft.pesronagemrgp;

public class Main {

    public static void main(String[] args) {

        Mago mago = new Mago();
        mago.setForca(0);
        mago.setMana(0);
        mago.setLevel(1);
        mago.setVida(1);
        mago.setInteligencia(5);
        mago.lvlUp();

        mago.attack();
        mago.attack();
        mago.attack();

        mago.apresentaMgia("sim");

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setForca(0);
        guerreiro.setMana(0);
        guerreiro.setLevel(1);
        guerreiro.setVida(1);
        guerreiro.setInteligencia(5);
        guerreiro.lvlUp();

        guerreiro.attack();
        guerreiro.attack();

        guerreiro.apresentaHabilidade("x");

    }
}
