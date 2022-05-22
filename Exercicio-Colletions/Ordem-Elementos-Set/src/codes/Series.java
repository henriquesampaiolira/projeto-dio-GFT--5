package codes;

import java.util.Objects;

public class Series{
    private String nome;
    private String genero;
    private Integer tempoEp;

    public Series(String nome, String genero, Integer tempoEp){
        this.nome    = nome;
        this.genero  = genero;
        this.tempoEp = tempoEp;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEp() {
        return tempoEp;
    }

    //reescrever o toString para não retornar o endereço de memória
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEp=" + tempoEp + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(nome, series.nome) && Objects.equals(genero, series.genero) && Objects.equals(tempoEp, series.tempoEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }

//    @Override
//    public int compareTo(Series serie) {
//        //comparando mais de um atributo da classe para imprimir todos objetos, visto que o Set não recebe Objetos iguais
//        Integer tmpEp = Integer.compare(this.getTempoEp(), serie.getTempoEp());
//        if(tmpEp != 0) return tmpEp;
//        return this.getGenero().compareTo(serie.getGenero());
//    }
}
