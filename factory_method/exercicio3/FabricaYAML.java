package factory_method.exercicio3;

public class FabricaYAML implements FabricaLeitorConfiguracao {
    @Override
    public LeitorConfiguracao criarLeitorConfiguracao() {
        return new LeitorYAML();
    }
}
