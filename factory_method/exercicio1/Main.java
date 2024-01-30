package factory_method.exercicio1;

public class Main {
    public static void main(String[] args) {
        FabricaDocumento fabricaPDF = new FabricaPDF();
        FabricaDocumento fabricaWord = new FabricaWord();
        FabricaDocumento fabricaHTML = new FabricaHTML();

        Documento documentoPDF = fabricaPDF.criarDocumento();
        Documento documentoWord = fabricaWord.criarDocumento();
        Documento documentoHTML = fabricaHTML.criarDocumento();

        documentoPDF.carregar();
        documentoWord.carregar();
        documentoHTML.carregar();
    }
}