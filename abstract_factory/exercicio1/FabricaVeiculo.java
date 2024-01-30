package abstract_factory.exercicio1;

public interface FabricaVeiculo {
    Veiculo criarCarro();
    Veiculo criarMoto();
    Veiculo criarCaminhao();
}