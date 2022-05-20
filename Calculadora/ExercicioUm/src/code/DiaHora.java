package code;

public class DiaHora {
    public DiaHora(){}
    public static void hora(int horario){
        switch (horario) {
            case 5, 6, 7, 8, 9, 10, 11 -> System.out.print("Bom dia!");
            case 12, 13, 14, 15, 16, 17 -> System.out.print("Boa tarde!");
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> System.out.print("Boa noite!");
        }
    }
}
