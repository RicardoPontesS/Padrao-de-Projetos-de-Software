package abstract_factory.exercicio1;

public class CaminhaoCombustivel extends Caminhao {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Caminh�o a Combust�vel.");
    }
}