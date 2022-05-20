package challenge2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> quiz = new ArrayList<>(){{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};
        iniciarQuiz q1 = new iniciarQuiz();
        q1.iniciar(quiz);
    }
}
class iniciarQuiz {
    public iniciarQuiz(){}
    public void iniciar(ArrayList<String> inicio){
        Scanner scan = new Scanner(System.in);
        int contResp=0, resp;
        for(String n : inicio){
            System.out.println(n);
            System.out.println("Digite 1 para responder como 'Sim' e 2 para 'Não'");
            resp=scan.nextInt();
            if(resp == 1)
                contResp+=1;
        }
        switch (contResp) {
            case 2 -> {
                System.out.println("Suspeita");
                return;
            }
            case 3, 4 -> {
                System.out.println("Cúmplice.");
                return;
            }
            case 5 -> {
                System.out.println("Assassina!!!");
                return;
            }
            default -> System.out.println("Inocente!");
        }
    };
}