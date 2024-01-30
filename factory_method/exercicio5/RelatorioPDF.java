package factory_method.exercicio5;

public class RelatorioPDF extends Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório em PDF...");
    }
}