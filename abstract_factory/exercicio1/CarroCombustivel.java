package abstract_factory.exercicio1;

public class CarroCombustivel extends Carro {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Ve�culo a Combust�vel.");
    }
}