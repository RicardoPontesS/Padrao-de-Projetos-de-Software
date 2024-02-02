package pps.geral.exercicio4;

public class RelatorioHTML implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório em HTML";
    }
}