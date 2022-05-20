package challenge1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> temps = new ArrayList<>();
        MaiorTemp val       = new MaiorTemp();
        int maior, soma     = 0;
        temps = val.addNaLista();
        maior = val.TempMaior(temps);
        soma  = val.soma(temps);
        System.out.println("Os valores passados foram: " + temps);
        System.out.println("A somatória dos valores passados foram: " + soma);
        System.out.println("O maior valor foi: " + maior);
    }
}
class MaiorTemp{
    private int soma;
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Integer> lista = new ArrayList<>();
    public MaiorTemp(){}
    public int TempMaior(ArrayList<Integer> lista){
        return Collections.max(lista);
    }
    public ArrayList<Integer> addNaLista(){
        for(int i=1;i<7;i++){
            System.out.println("Digite a "+i+"° temperatura do semestre: ");
            int valor = scan.nextInt();
            lista.add(valor);
        }
        return lista;
    }
    public Integer soma(ArrayList<Integer> lista){
        for(Integer n : lista){
            this.soma += n;
        }
        return soma;
    }
}