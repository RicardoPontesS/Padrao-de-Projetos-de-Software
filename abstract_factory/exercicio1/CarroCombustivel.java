package abstract_factory.exercicio1;

public class CarroCombustivel extends Carro {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Veículo a Combustível.");
    }
}