package codes;

import static java.lang.CharSequence.compare;

public class LinguagemFavorita {
    private String nome;
    private String anoDeCriacao;
    private String ide;

    public String getNome() {
        return nome;
    }

    public String getAnoDeCriacao() {
        return anoDeCriacao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    public String getIde() {
        return ide;
    }

    public LinguagemFavorita(String nome, String anoDeCriacao, String ide){
        this.nome         = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide          = ide;
    }

}
