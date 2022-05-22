package codes;

import java.util.*;

//modelo = gol - consumo = 14.4km/l
//modelo = uno - consumo = 15.6km/l
//modelo = mobi - consumo = 16.1km/l
//modelo = hb20 - consumo = 14.5km/l
//modelo = kwid - consumo = 15.6km/l
public class Main {
    public static void main(String[] args) {
        System.out.println("Dicionario que relaciona os modelos e o consumo.");
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Substituir consumo do gol por 15.2km/l");
        carros.put("gol",15.2);
        System.out.println("Tucson esta no dicionario? "+ carros.containsKey("tucson"));
        System.out.println("Consumo do uno: "+carros.get("uno"));
        System.out.println("Exibir os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        System.out.println("Exibir os consumos: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);
        System.out.println("Modelo mais economico e seu consumo: ");
        Double max  = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEficiente;
        for (Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(max)){
                modeloEficiente = entry.getKey();
                System.out.println("Modelo eficiente "+modeloEficiente+" - "+max);
            }
        }
        String modeloEconomico;
        Double min = Collections.min(consumos);
        for (Map.Entry<String, Double> entry : carros.entrySet()){
            if(entry.getValue().equals(min)){
                modeloEconomico = entry.getKey();
                System.out.println("Modelo menos economico: "+modeloEconomico+" - "+min) ;
            }
        }
        System.out.println("Soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("Média de consumo: " + soma/ carros.size());
        Iterator<Double> iterator1 = carros.values().iterator();
        System.out.println("Carros: "+carros);
        //removendo carros com consumo de 15.6
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println("Carros: "+carros);
        //Informando na ordem que foram inseridos
        Map<String, Double> carrosLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosLinked);
        //ordenando pela chave, quem ordena a chave é o TreeMap
        Map<String, Double> carrosTree = new TreeMap<>(carrosLinked);
        System.out.println(carrosTree.toString());
        //apagando o dicionário
        carros.clear();
        System.out.println(carros);
        System.out.println("Dicionario carros esta vazio? "+carros.isEmpty());
    }
}
