package factory_method.exercicio3;

public class LeitorXML extends LeitorConfiguracao {
    @Override
    public void lerConfiguracao(String arquivo) {
        System.out.println("Lendo arquivo XML de configuração: " + arquivo);
        
    }
}