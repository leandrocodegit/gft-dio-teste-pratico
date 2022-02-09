package br.com.gft.leitura;

import java.util.List;

public class Leitor {


    private String nome;
    private Livro livroFavorito;
    private List<Livro> estanteLivros;

    public Leitor(String nome, Livro livroFavorito, List<Livro> estanteLivros) {
        this.nome = nome;
        this.livroFavorito = livroFavorito;
        this.estanteLivros = estanteLivros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroFavorito() {
        return livroFavorito;
    }

    public void setLivroFavorito(Livro livroFavorito) {
        this.livroFavorito = livroFavorito;
    }

    public List<Livro> getEstanteLivros() {
        return estanteLivros;
    }

    public void setEstanteLivros(List<Livro> estanteLivros) {
        this.estanteLivros = estanteLivros;
    }

    public void adicionarLivro(Livro livro){
        estanteLivros.add(livro);
    }
    public void removerLivro(Livro livro){
        livro.setPaginasLidas(0);
        estanteLivros.remove(livro);
    }
}
