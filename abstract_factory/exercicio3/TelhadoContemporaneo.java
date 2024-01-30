package abstract_factory.exercicio3;

public class TelhadoContemporaneo implements Telhado {
    @Override
    public void construir() {
        System.out.println("Construindo telhado contemporâneo");
    }
}