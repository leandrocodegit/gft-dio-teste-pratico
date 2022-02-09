package br.com.gft.sorteio;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public static void main(String[] args) {

        Random sorteio = new Random();
        Scanner telcado = new Scanner(System.in);

        System.out.println("Vamos jogar? \n Escolha um numero de 0 a 10");

        while (true) {

            if (telcado.nextInt() == sorteio.nextInt(10)) {
                System.out.println("Você acertou!");
                break;
            }
            else{
                System.out.println("Você errou! \n Escolha outro numero!");
            }

        }
    }
}
