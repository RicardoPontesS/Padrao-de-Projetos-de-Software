package factory_method.exercicio3;

public class FabricaXML implements FabricaLeitorConfiguracao {
    @Override
    public LeitorConfiguracao criarLeitorConfiguracao() {
        return new LeitorXML();
    }
}