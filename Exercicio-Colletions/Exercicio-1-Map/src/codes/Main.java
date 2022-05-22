package codes;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Crie um dicionario e relacione os estados e suas populacoes.");
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado);
        }
        System.out.println("Substitua a populacao do estado do RN por 3.534.165.");
        estados.put("PE", 3534165);
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado);
        }
        System.out.println("Confira se o estado PB esta no dicionario, caso nao adicione: PB - 4.039.277.");
        if(!estados.containsKey("PB")) estados.put("PB", 4039277);
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado);
        }
        System.out.println("Exiba a populacao PE.");
        System.out.println("Populacao de PE: "+ estados.get("PE"));
        System.out.println("Exiba todos os estados e suas populacoes na ordem que foi informado.");
        Map<String, Integer> estadosLinked = new LinkedHashMap<>(){{
            put("PE", 3534165);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estado : estadosLinked.entrySet()) {
            System.out.println(estado);
        }
        System.out.println("Exiba os estados e suas populacoes em ordem alfabetica.");
        Map<String, Integer> estadosTree = new TreeMap<>(){{
            put("PE", 3534165);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estado : estadosTree.entrySet()) {
            System.out.println(estado);
        }
        System.out.println("Exiba o estado com o menor populacao e sua quantidade.");
        Collection<Integer> pop = estadosTree.values();
        int popMin = Collections.min(pop);
        for (Map.Entry<String, Integer> estado : estadosTree.entrySet()) {
            if(estado.getValue().equals(popMin))
                System.out.println("Estado com menor populacao: "+estado.getKey()+" com populacao de: "+estado.getValue());
        }
        System.out.println("Exiba o estado com a maior populacao e sua quantidade.");
        int popMax = Collections.max(pop);
        for (Map.Entry<String, Integer> estado : estadosTree.entrySet()) {
            if(estado.getValue().equals(popMax))
                System.out.println("Estado com maior populacao: "+estado.getKey()+" com populacao de: "+estado.getValue());
        }
        System.out.println("Exiba a soma da populacao desses estados.");
        int popSoma = 0;
        for (Map.Entry<String, Integer> estado : estadosTree.entrySet()) {
                popSoma += estado.getValue();
        }
        System.out.println("Soma das populacoes dos estados: "+popSoma);
        System.out.println("Exiba a media da populacao deste dicionario de estados.");
        System.out.println("Media de populacao dos estados: "+(popSoma/ estados.size()));
        System.out.println("Remova os estados com a populacao menor que 4.000.000.");
        Iterator<Integer> iterator = estadosTree.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next() < 4000000){
                iterator.remove();
            }
        }
        for (Map.Entry<String, Integer> estado : estadosTree.entrySet()) {
            System.out.println(estado);
        }
        //Apague o dicionário de estados
        estados.clear();
        System.out.println("Dicionario esta vazio? "+estados.isEmpty());
    }
}