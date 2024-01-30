package abstract_factory.exercicio1;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaEletrica = new FabricaVeiculoEletrico();
        FabricaVeiculo fabricaCombustivel = new FabricaVeiculoCombustivel();

        Veiculo carroEletrico = fabricaEletrica.criarCarro();
        Veiculo motoCombustivel = fabricaCombustivel.criarMoto();

        carroEletrico.exibirInfo();
        motoCombustivel.exibirInfo();
    }
}