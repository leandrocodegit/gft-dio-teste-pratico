package br.com.gft.pesronagemrgp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

    private List<String> habilidade;
    private final Random numeroRandomico = new Random();

    public Guerreiro() {
        habilidade = new ArrayList<>();
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        setVida(getVida() + 1);
        setForca(getForca() + 1);
    }

    public void attack() {

        setForca(getInteligencia() / 2 * (getLevel() * getLevel()) + numeroRandomico.nextInt(180));
        habilidade.add("F: " + getForca() + " I: " + getInteligencia() + " L: " + getLevel() + " M: " + getMana());

    }

    public void apresentaHabilidade(String hab) {

        System.out.println("Habilidades");

        for (String x : habilidade) {
            System.out.println(x);
        }

    }

}
