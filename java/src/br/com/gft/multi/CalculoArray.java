package br.com.gft.multi;

public class CalculoArray {

    public static void main(String[] args) {


        int[] vetor1 = {10, 5, 98, 452};
        int[] vetor2 = {10, 5, 98, 452, 10};

        processaArray(vetor1, vetor2);

    }

    public static void processaArray(int[] vetor1, int[] vetor2) {

        int mult = 0;

        if (vetor1.length != vetor2.length) {
            throw new RuntimeException();
        }
        for (int i = 0; i < vetor1.length; i++) {
            mult += vetor1[i] * vetor2[i];
        }

        System.out.println("Mult" + mult);

    }

}
