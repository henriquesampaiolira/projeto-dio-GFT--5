package codes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Carro {
    Roda roda;
    Som som;
    Assento assento;
    Motor motor;
}
