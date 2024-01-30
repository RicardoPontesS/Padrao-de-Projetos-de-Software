package factory_method.exercicio4;

public class FabricaEventoErro implements FabricaEvento {
    @Override
    public Evento criarEvento() {
        return new EventoErro();
    }
}