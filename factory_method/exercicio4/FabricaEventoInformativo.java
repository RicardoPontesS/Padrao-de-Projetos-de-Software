package factory_method.exercicio4;

public class FabricaEventoInformativo implements FabricaEvento {
    @Override
    public Evento criarEvento() {
        return new EventoInformativo();
    }
}
