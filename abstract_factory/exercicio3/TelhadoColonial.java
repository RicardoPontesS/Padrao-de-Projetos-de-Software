package abstract_factory.exercicio3;

public class TelhadoColonial implements Telhado {
    @Override
    public void construir() {
        System.out.println("Construindo telhado colonial");
    }
}