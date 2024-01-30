package abstract_factory.exercicio3;

public class ParedesColoniais implements Paredes {
    @Override
    public void construir() {
        System.out.println("Construindo paredes coloniais");
    }
}
