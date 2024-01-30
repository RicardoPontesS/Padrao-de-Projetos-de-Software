package abstract_factory.exercicio3;

public class ParedesContemporaneas implements Paredes {
    @Override
    public void construir() {
        System.out.println("Construindo paredes contemporâneas");
    }
}