package exercicio.catalogoDeLivros;

public class Livro {
    private String nome;
    private String autor;
    private int ano_de_publicacao;

    public Livro(String nome, String autor, int ano_de_publicacao) {
        this.nome = nome;
        this.autor = autor;
        this.ano_de_publicacao = ano_de_publicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno_de_publicacao() {
        return ano_de_publicacao;
    }

    @Override
    public String toString() {
        return "\nLivro { " +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", ano_de_publicacao=" + ano_de_publicacao +
                '}';
    }
}