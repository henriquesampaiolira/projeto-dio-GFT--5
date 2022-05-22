package codes;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//(x)      Crie uma classe LinguagemFavorita que possua os atributos
//       nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
//(x)      3 linguagens e faça um programa que ordene esse conjunto
//        por:
//(x)      Ordem de Inserção
//(X)      Ordem Natural (nome)
//(X)      IDE
//(X)      Ano de criação e nome
//()      Nome, ano de criacao e IDE
//()      Ao final, exiba as linguagens no console, um abaixo da outra.
public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> ling = new LinkedHashSet<>();
        ling.add(new LinguagemFavorita("JavaScript", "2011", "Intellij"));
        ling.add(new LinguagemFavorita("Java", "1991", "Intellij"));
        ling.add(new LinguagemFavorita("Python", "1990", "PyCharm"));
        System.out.println("Ordem de inserção: ");
        for (LinguagemFavorita lin : ling){
            System.out.println(lin);
        }
        //Organizado dependendo da classe chamada na hora da instância do objeto
        Set<LinguagemFavorita> ling2 = new TreeSet<>(new CompTotal());
        ling2.addAll(ling);
        for (LinguagemFavorita lin : ling2){
            System.out.println(lin);
        }
        //Linguagens um abaixo da outra
        for (LinguagemFavorita lin : ling2){
            System.out.println(lin.getNome());
        }
    }
}
