package codes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Series> serie = new HashSet<>(){{
            add(new Series("Got","Fantasia",60));
            add(new Series("Dark","Drama", 60));
            add(new Series("Aleatorio","Qualquer", 40));
        }};
        //ordem aleatorio, basta imprimir pois o HashSet já armazena de fora aleatória
        for(Series aSerie : serie)  System.out.println(aSerie.getNome() + " - " + aSerie.getGenero() + " - " + aSerie.getTempoEp());
        //ordem de inserção o HashSet não imprime, mas dá para utilizar o LinkedHashSet para tal
        Set<Series> serie2 = new LinkedHashSet<>(){{
            add(new Series("Got","Fantasia",60));
            add(new Series("Dark","Drama", 60));
            add(new Series("Aleatorio","Qualquer", 40));
        }};
        System.out.println("-");
        for(Series aSerie : serie2)  System.out.println(aSerie.getNome() + " - " + aSerie.getGenero() + " - " + aSerie.getTempoEp());
        System.out.println("TreeSet para ordenar a lista.");
        Set<Series> serie3 =  new TreeSet<>(serie);
        for(Series aSerie : serie3)  System.out.println(aSerie.getNome() + " - " + aSerie.getGenero() + " - " + aSerie.getTempoEp());
        System.out.println("Ordenar lista em relação a todos os elementos.");
        Set<Series> serie4 = new TreeSet<>(new CompNameGenTemp());
        serie4.addAll(serie);
        for(Series aSerie : serie4)  System.out.println(aSerie.getNome() + " - " + aSerie.getGenero() + " - " + aSerie.getTempoEp());

    }
}
