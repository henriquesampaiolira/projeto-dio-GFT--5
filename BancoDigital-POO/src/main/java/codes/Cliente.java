package codes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cliente {
    protected List<Conta> listContas = new ArrayList<>();
    String nome;
    protected void addContaCliente(Conta conta){
        listContas.add(conta);
    }
    protected void printContaCliente(){
        for(Conta conta : listContas){
            conta.imprimirConta();
        }
    }
}
