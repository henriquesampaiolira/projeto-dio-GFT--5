package code;
public class main {
    public static void main(String[] args) {
        System.out.printf("Exercício - Calculadora%n");
        Calculadora.soma(6,10);
        Calculadora.sub(7,8);
        Calculadora.div(10,15);
        Calculadora.mult(20,50);
        System.out.printf("Exercício - Momento do dia%n");
        DiaHora.hora(15);
        DiaHora.hora(8);
        DiaHora.hora(21);
        System.out.printf("Exercício - Empréstimo%n");
        Emprestimo.calc(100,12);
    }
}
