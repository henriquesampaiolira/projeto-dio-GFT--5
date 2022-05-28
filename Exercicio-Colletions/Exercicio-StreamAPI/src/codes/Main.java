package codes;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numAleat = Arrays.asList("1", "0","4", "8","6","2","3","7");
        System.out.println("Imprimir todos os valores dentro da lista.");
        /*
        Utilizando interface funcional
        numAleat.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        /*utilizando lambda
        numAleat.stream().forEach(s -> System.out.println(s));
        existe um método no List que também é forEach, logo o stream torna-se desnecessário
        podemos também transformar em um método de referência
        numAleat.forEach(System.out::println);
        */
        System.out.println("Colocar os 5 primeiros numeros do List e colocar dentro de um Set:");
        numAleat.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("Transformar a lista de String em uma lista de inteiros.");
        //o método .map vai pegar o valor de um tipo e transformar em outro
        List<Integer> novaList = numAleat
                .stream()
                .map(Integer::parseInt).toList();
        System.out.println("Pegar todos os numeros pares maiores que 2 e colocar numa nova lista.");
        List<Integer> listMaiores = numAleat.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .toList();
        System.out.println(listMaiores);
        System.out.println("Media da lista de String.");
        //o average faz a média, o ifPresent (passando o new DoubleConsumer) evita retornar um erro
        numAleat.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        System.out.println("Remover numeros impares.");
        novaList.removeIf(integer -> integer % 2 != 0);
            }
        }

}




















