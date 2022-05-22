package codes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int qtdLancamentos    = 100;
        List<Integer> valores = new ArrayList<>();
        Random geradorValor   = new Random();
        for(int i=0;i<qtdLancamentos;i++){
            int num = geradorValor.nextInt(10)+1;
            valores.add(num);
        }
        Map<Integer, Integer> lancados = new HashMap<>();
        for(Integer resultado : valores){
            if(lancados.containsKey(resultado))
                lancados.put(resultado, lancados.get(resultado)+1);
            else lancados.put(resultado, 1);
        }
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancados.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
