package factory_method.exercicio5;

public class FabricaRelatorioPDF implements FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}