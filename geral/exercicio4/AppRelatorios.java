package pps.geral.exercicio4;

public class AppRelatorios {
    public static void main(String[] args) {
        GeradorRelatorio geradorSimples = new GeradorRelatorioSimples();
        Relatorio relatorioSimples = geradorSimples.criarRelatorio();
        System.out.println(relatorioSimples.gerar());

        GeradorRelatorio geradorCompleto = new GeradorRelatorioCompleto();
        Relatorio relatorioCompleto = geradorCompleto.criarRelatorio();
        System.out.println(relatorioCompleto.gerar());

        GeradorRelatorio geradorHTML = new GeradorRelatorioHTML();
        Relatorio relatorioHTML = geradorHTML.criarRelatorio();
        System.out.println(relatorioHTML.gerar());

        GeradorRelatorio geradorPDF = new GeradorRelatorioPDF();
        Relatorio relatorioPDF = geradorPDF.criarRelatorio();
        System.out.println(relatorioPDF.gerar());
    }
}
