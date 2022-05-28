package codes;

import lombok.Getter;
import lombok.Setter;


import java.util.*;
@Getter
@Setter

public abstract class Conta {
    protected static final int AGENCIA_PADRAO = 1;
    public static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;
    protected List<String> tipoExt = new ArrayList<>();
    protected List<Double> valorExt = new ArrayList<>();

    public Conta(Cliente cliente, Banco banco){
        agencia = AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    void sacar(double valor){
        this.saldo -= valor;
        tipoExt.add("Saque");
        valorExt.add(valor);

    }
    void depositar(double valor){
        this.saldo += valor;
        tipoExt.add("Deposito");
        valorExt.add(valor);
    }
    void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        tipoExt.add("Transf.");
        valorExt.add(valor);
        contaDestino.depositar(valor);
    }
    void imprimirExtrato(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Banco: %s",this.banco.getNome()));
        System.out.println(String.format("Agencia: %d",this.getAgencia()));
        System.out.println(String.format("Numero: %d",this.getNumero()));
        System.out.println(String.format("Saldo: %.2f",this.getSaldo()));
        System.out.println("=== Extrato da conta ===");
        for(int i=0;i<tipoExt.size();i++) System.out.println(tipoExt.get(i)+" = "+valorExt.get(i));
        System.out.println("===        ===       ===");
    }
    void imprimirConta(){
        System.out.println(String.format("Banco: %s",this.banco.getNome()));
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.getAgencia()));
        System.out.println(String.format("Numero: %d",this.getNumero()));
        System.out.println(String.format("Saldo: %.2f",this.getSaldo()));
    }

}
