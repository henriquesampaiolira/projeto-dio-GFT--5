package codes;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Banco CentralBank = new Banco("CentralBank");
        c2.setNome("Aylla");
        c1.setNome("Henrique");
        Conta cc = new ContaCorrente(c1,CentralBank);
        Conta cp = new ContaPoupanca(c1,CentralBank);
        System.out.println("Conta corrente:");
        System.out.println();
        System.out.println("Conta poupanca:");
        cp.depositar(10);
        cp.sacar(50);
        cp.depositar(70);
        cp.depositar(20);
        cp.transferir(30, cc);
        cp.imprimirExtrato();
        c1.addContaCliente(cc);
        c1.addContaCliente(cp);
        c1.printContaCliente();
    }
}
