package factory_method.exercicio5;

public class Main {
    public static void main(String[] args) {
        FabricaRelatorio fabricaPDF = new FabricaRelatorioPDF();
        FabricaRelatorio fabricaCSV = new FabricaRelatorioCSV();
        FabricaRelatorio fabricaHTML = new FabricaRelatorioHTML();

        Relatorio relatorioPDF = fabricaPDF.criarRelatorio();
        Relatorio relatorioCSV = fabricaCSV.criarRelatorio();
        Relatorio relatorioHTML = fabricaHTML.criarRelatorio();

        relatorioPDF.gerar();
        relatorioCSV.gerar();
        relatorioHTML.gerar();
    }
}