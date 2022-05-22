package codes;

import java.util.*;

// Autor: Hawking, Stephen - Livro = nome: Uma breve história do tempo, pag: 256
// Autor: Duhigg, Charles - Livro = nome: O Poder do Hábito, pag: 408
// Autor: Harati - Livro = nome: 21 Lições Para o Séculos 21, pag: 432
public class Main {
    public static void main(String[] args) {
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harati", new Livro("21 Licoes Para o Seculos 21", 432));
        }};
        for(Map.Entry<String, Livro> livros : meusLivros.entrySet()){
            System.out.println("Autor: "+livros.getKey()+". "+livros.getValue().getNome());
        }
        //ordem de inserção: LinkedHashMap
        System.out.println("Ordem de insercao: LinkedHashMap");
        Map<String, Livro> meusLivrosLinked = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harati", new Livro("21 Licoes Para o Seculos 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meusLivrosLinked.entrySet()){
            System.out.println("Nome: "+livro.getKey()+" - "+livro.getValue().getNome());
        }
        //ordem alfabética dos autores
        System.out.println("Ordem alfabetica dos autores");
        Map<String, Livro> meusLivrosTree = new TreeMap<>(meusLivrosLinked);
        for(Map.Entry<String, Livro> livro : meusLivrosTree.entrySet()){
            System.out.println("Autor: "+livro.getKey()+" - "+livro.getValue().getNome());
        }
        //ordem alfabética dos livros
        System.out.println("Ordem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> meusLivrosSet = new TreeSet<>(new ComparatorLivros());
        meusLivrosSet.addAll(meusLivrosLinked.entrySet());
        for(Map.Entry<String, Livro> livro : meusLivrosSet){
            System.out.println("Autor: "+livro.getKey()+" - "+livro.getValue().getNome());
        }
        //ordem crescente das páginas
        System.out.println("Ordem crescente das paginas: ");
        Set<Map.Entry<String, Livro>> meusLivrosSet2 = new TreeSet(new ComparatorPag());
        meusLivrosSet2.addAll(meusLivrosSet);
        for(Map.Entry<String, Livro> livro : meusLivrosSet2){
            System.out.println("Autor: "+livro.getKey()+" - "+livro.getValue().getNome());
        }
    }
}
