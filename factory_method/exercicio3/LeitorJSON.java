package factory_method.exercicio3;

public class LeitorJSON extends LeitorConfiguracao {
    @Override
    public void lerConfiguracao(String arquivo) {
        System.out.println("Lendo arquivo JSON de configuração: " + arquivo);
        
    }
}