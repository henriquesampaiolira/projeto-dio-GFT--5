package codes;

public class TesteFactory {
    public static Carro montarCarro(String tipo){
        CarroFactory carroFactory = null;
        switch (tipo){
            case "luxo":
                carroFactory = new CarroLuxoFactory();
                break;
            case "popular":
                carroFactory = new CarroPopular();
                break;
        }
        Carro carro = new Carro();
        carro.setAssento(carroFactory.montarAssento());
        carro.setMotor(carroFactory.montarMotor());
        carro.setSom(carroFactory.montarSom());
        carro.setRoda(carroFactory.montarRoda());
        return carro;
    }

    public static void main(String[] args) {
        Carro Carrinho_1 = montarCarro("luxo");
        Carro Carrinho_2 = montarCarro("popular");
        System.out.println("Carro de luxo: "+Carrinho_1);
        System.out.println("Carro popular: "+Carrinho_2);
    }
}
