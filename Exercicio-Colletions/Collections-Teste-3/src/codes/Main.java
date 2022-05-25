package codes;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Set<Integer> list = new TreeSet<>();
        for(int i = 0; i < m; i++) {
            int a = scan.nextInt();
            list.add(a);
        }
        if(list.size()>m)
            System.out.println(0);
        else
            System.out.println(n - list.size());
    }
}