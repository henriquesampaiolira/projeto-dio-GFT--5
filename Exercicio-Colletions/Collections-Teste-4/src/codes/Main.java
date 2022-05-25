package codes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();
        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int count = 0;
        for (String res : respostasCompetidoresSplit) {
            if (res.equals(T))
                count++;
        }
        System.out.println(count);
    }
}