package pps.geral.exercicio4;

public class RelatorioPDF implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório em PDF";
    }
}