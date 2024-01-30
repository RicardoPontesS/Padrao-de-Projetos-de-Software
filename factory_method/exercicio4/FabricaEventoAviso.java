package factory_method.exercicio4;

public class FabricaEventoAviso implements FabricaEvento {
    @Override
    public Evento criarEvento() {
        return new EventoAviso();
    }
}