package abstract_factory.exercicio1;

public class MotoCombustivel extends Moto {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Moto a Combustível.");
    }
}
