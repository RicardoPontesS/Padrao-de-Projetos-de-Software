package pps.geral.exercicio4;

public class GeradorRelatorioPDF extends GeradorRelatorio {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}