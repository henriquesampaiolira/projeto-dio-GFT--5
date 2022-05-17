package code;

public class Calculadora {
    public Calculadora(){}
    public static void soma(double num1, double num2){
        double res = num1+num2;
        System.out.println("A soma de "+num1+" + "+num2+" é "+res);
    }
    public static void sub(double num1, double num2){
        double res = num1-num2;
        System.out.println("A subtração de "+num1+" - "+num2+" é "+res);
    }
    public static void div(double num1, double num2){
        double res = num1/num2;
        System.out.println("A divisão de "+num1+" / "+num2+" é "+res);
    }
    public static void mult(double num1, double num2){
        double res = num1*num2;
        System.out.println("A multiplicação de "+num1+" * "+num2+" é "+res);
    }
}
