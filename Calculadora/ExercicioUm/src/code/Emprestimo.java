package code;

public class Emprestimo{
    public Emprestimo(){}
    public static void calc(double valor, int parc){
        double taxa=0;
        double total=0;
        if(parc>=1 || parc<=12){
            total=valor+taxa(valor,parc);
            System.out.printf("O valor total é de R$"+total+" dividindo para "+parc+" parcelas.");
        }else{
            System.out.print("Valor de parcelas inválida.");
        }
    }
    public static double taxa(double val,int parc){
        double valorTaxa=0;
        return valorTaxa = (val*parc)/100;
    }
}
