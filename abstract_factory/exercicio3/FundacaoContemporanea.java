package abstract_factory.exercicio3;

public class FundacaoContemporanea implements Fundacao {
    @Override
    public void construir() {
        System.out.println("Construindo fundação contemporânea");
    }
}
