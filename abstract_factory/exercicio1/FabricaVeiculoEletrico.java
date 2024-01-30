package abstract_factory.exercicio1;

public class FabricaVeiculoEletrico implements FabricaVeiculo {
    @Override
    public Veiculo criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Veiculo criarMoto() {
        return new MotoEletrica();
    }

    @Override
    public Veiculo criarCaminhao() {
        return new CaminhaoEletrico();
    }
}