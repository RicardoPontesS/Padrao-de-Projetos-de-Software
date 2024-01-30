package abstract_factory.exercicio3;

public class FundacaoColonial implements Fundacao {
    @Override
    public void construir() {
        System.out.println("Construindo fundação colonial");
    }
}