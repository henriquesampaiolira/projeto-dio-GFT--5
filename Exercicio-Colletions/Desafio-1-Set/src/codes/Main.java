package codes;

import java.util.*;

import static java.lang.String.valueOf;

//(x)       Crie um conjunto contendo as cores do arco-íris e:
//(x)        Exiba todas as cores uma abaixo da outra
//(x)        A quantidade de cores que o arco-íris tem
//(x)        Exiba as cores em ordem alfabética
//(x)       Exiba as cores na ordem inversa da que foi informada
//(X)       Exiba todas as cores que começam com a letra ”v”
//(x)        Remova todas as cores que não começam com a letra “v”
//(x)        Limpe o conjunto
//(x)        Confira se o conjunto está vazio
public class Main {
    public static void main(String[] args) {
        Set<String> coresHash = new HashSet<>(){};
        coresHash.add("Vermelha");
        coresHash.add("Laranja");
        coresHash.add("Amarela");
        coresHash.add("Verde");
        coresHash.add("Azul");
        coresHash.add("Azul-escuro");
        coresHash.add("Violeta");
        System.out.println("As cores do arco-íris são: ");
        for(String cor : coresHash) System.out.println(cor);
        System.out.println("O arco-iris tem "+ coresHash.size()+" cores.");
        //ordem alfabética
        Set<String> coresTree = new TreeSet<>(coresHash);
        System.out.println(coresTree);
        //ordem inversa
        List<String> coresTreeListReverse = new ArrayList<>(coresTree);
        Collections.reverse(coresTreeListReverse);
        System.out.println(coresTreeListReverse);
        System.out.println("Cores que comecam com V: ");
        for (String cor : coresTree) {
            if(cor.startsWith("V")) System.out.println(cor);
        }
        System.out.println("Todas as cores que nao comecam com 'V'");
        coresTree.removeIf(cor -> cor.startsWith("V"));
        System.out.println(coresTree);
        coresTree.clear();
        System.out.println(coresTree);
        System.out.println("A lista coresTree está fazia? "+ coresTree.isEmpty());
    }
}



















