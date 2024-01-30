package factory_method.exercicio3;

public class FabricaJSON implements FabricaLeitorConfiguracao {
    @Override
    public LeitorConfiguracao criarLeitorConfiguracao() {
        return new LeitorJSON();
    }
}