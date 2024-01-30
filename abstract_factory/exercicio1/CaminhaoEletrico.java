package abstract_factory.exercicio1;

public class CaminhaoEletrico extends Caminhao {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Caminhão Elétrico.");
    }
}