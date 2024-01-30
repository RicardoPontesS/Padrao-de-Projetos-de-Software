package abstract_factory.exercicio1;

public class MotoEletrica extends Moto {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Moto Elétrica.");
    }
}