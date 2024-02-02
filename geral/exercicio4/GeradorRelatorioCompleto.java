package pps.geral.exercicio4;

public class GeradorRelatorioCompleto extends GeradorRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioCompleto();
    }
}