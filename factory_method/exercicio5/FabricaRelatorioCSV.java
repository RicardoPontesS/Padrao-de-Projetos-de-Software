package factory_method.exercicio5;

public class FabricaRelatorioCSV implements FabricaRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioCSV();
    }
}