package codes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criacao de lista com HashSet e inserindo valor na criacao.");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,3.6,8.9,5.5,7.7,7.0));
        //pode-se notar que os valores inseridos ficam armazenados de forma aleatória
        //e que não é armazenado valores iguais
        System.out.println(notas.toString());
        //não pode substituir um valor pelo outro
        System.out.println("Verificar se ha um valor na lista. Ex: 5.5 = "+notas.contains(5.5)); //retorna um booleano
        //não pode retornar o valor dado uma posição pois não tem o método get
        System.out.println("Exibir maior valor: "+ Collections.max(notas));
        System.out.println("Exibir menor valor: "+ Collections.min(notas));
        //Utilização do iterator para passar por todos os valores e fazer a soma
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: "+soma);
        //Método size retorna a quantidade de valores dentro da lista
        System.out.println("Media: "+(soma/ notas.size()));
        //remover um valor
        notas.remove(5.5);
        System.out.println(notas.toString());
        //não remove valor dada posição, pois HashSet não trabalha com index
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if (next < 7d) iterator1.remove();
        }
        //como valores foram adicionados na declaração da lista, não dá para definir uma ordem
        //por conta da aleatoriedade do HashSet, mas se adicionados depois dá
        Set<Double> notas2 = new LinkedHashSet<>(){};
        notas2.add(7d);
        notas2.add(3.6);
        notas2.add(8.9);
        notas2.add(5.5);
        notas2.add(7.7);
        notas2.add(7.0);
        System.out.println(notas2.toString());
        //exibir por ordem crescente, passando a lista para a implementação TreeSet os valores se organizam
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3.toString());
        //método para apagar o conteúdo da lista
        notas.clear();
        //método para saber se o conjunto está vazio
        System.out.println("Notas esta vazio? "+notas.isEmpty());
        

    }
}
