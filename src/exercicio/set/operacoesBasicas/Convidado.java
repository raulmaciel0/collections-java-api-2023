package exercicio.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int cod_convite;

    public Convidado(String nome, int cod_convite) {
        this.nome = nome;
        this.cod_convite = cod_convite;
    }

    public String getNome() {
        return nome;
    }

    public int getCod_convite() {
        return cod_convite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCod_convite() == convidado.getCod_convite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod_convite());
    }

    @Override
    public String toString() {
        return "\nConvidado {" +
                " nome='" + nome + '\'' +
                ", cod_convite=" + cod_convite +
                '}';
    }
}
