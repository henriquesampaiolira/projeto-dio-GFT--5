package codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto de notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(8d,5.7,10d,4.3,8.8,6d,8d));
        System.out.print(notas.toString());
        System.out.print(notas);
        //Os elementos repetidos entraram somente uma vez
    }
}