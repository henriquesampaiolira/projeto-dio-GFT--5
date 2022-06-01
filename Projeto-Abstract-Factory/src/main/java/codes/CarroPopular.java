package codes;

public class CarroPopular extends CarroFactory{
    public Roda montarRoda() {
        return new RodaSimples();
    }
    public Som montarSom() {
        return new SomBaixo();
    }
    public Motor montarMotor() {
        return new MotorOpaco();
    }
    public Assento montarAssento() {
        return new AssentoBarato();
    }
}
