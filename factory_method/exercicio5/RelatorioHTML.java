package factory_method.exercicio5;

public class RelatorioHTML extends Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relat�rio em HTML...");
    }
}