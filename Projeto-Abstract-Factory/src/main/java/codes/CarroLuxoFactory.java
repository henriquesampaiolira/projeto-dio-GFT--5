package codes;

public class CarroLuxoFactory extends CarroFactory{
    public Roda montarRoda() {
        return new RodaEspecifica();
    }
    public Som montarSom() {
        return new SomAlto();
    }
    public Motor montarMotor() {
        return new MotorBrilhante();
    }
    public Assento montarAssento() {
        return new AssentoParrudo();
    }
}
