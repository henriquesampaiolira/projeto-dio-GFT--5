package codes;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {
    String nome;
    public Banco(String nome){
        this.nome = nome;
    }

}
