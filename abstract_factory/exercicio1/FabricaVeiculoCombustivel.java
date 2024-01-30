package abstract_factory.exercicio1;

public class FabricaVeiculoCombustivel implements FabricaVeiculo {
    @Override
    public Veiculo criarCarro() {
        return new CarroCombustivel();
    }

    @Override
    public Veiculo criarMoto() {
        return new MotoCombustivel();
    }

    @Override
    public Veiculo criarCaminhao() {
        return new CaminhaoCombustivel();
    }
}