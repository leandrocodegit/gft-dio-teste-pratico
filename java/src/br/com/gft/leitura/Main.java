package br.com.gft.leitura;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<Livro>(){{
            add(new Livro("GFT START#1",100,0));
            add(new Livro("GFT START#2",110,0));
            add(new Livro("GFT START#3",120,0));
            add(new Livro("GFT START#4 FUTURE",150,0));
        }};

        Livro livroFavorito = new Livro("GFT START#4 FUTURE",150,0);

        livros.add(livroFavorito);

        System.out.println(livros);

        Leitor leitor = new Leitor("Leandro Oliveira",livroFavorito, livros);


        Livro livroF = new Livro("GFT JAVA",2010,0);

        leitor.adicionarLivro(livroF);

        System.out.println(leitor.getEstanteLivros());





    }
}
