package br.com.gft.pesronagemrgp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

    private List<String> magia;
    private final Random numeroRandomico = new Random();

    public Mago() {
        magia = new ArrayList<>();
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public void lvlUp() {
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
    }

    public void attack() {

        setForca(getForca() / 2 * (getLevel() * getLevel()) + numeroRandomico.nextInt(180));
        magia.add("F: " + getForca() + " I: " + getInteligencia() + " L: " + getLevel() + " M: " + getMana());

    }

    public void apresentaMgia(String mag) {

        System.out.println("Magias");

        for (String x : magia) {
            System.out.println(x);
        }

    }

}
