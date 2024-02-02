package pps.geral.exercicio4;

public class GeradorRelatorioHTML extends GeradorRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }
}