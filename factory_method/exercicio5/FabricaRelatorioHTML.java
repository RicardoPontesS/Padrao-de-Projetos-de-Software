package factory_method.exercicio5;

public class FabricaRelatorioHTML implements FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }
}