package pps.geral.exercicio4;

public class GeradorRelatorioSimples extends GeradorRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioSimples();
    }
}