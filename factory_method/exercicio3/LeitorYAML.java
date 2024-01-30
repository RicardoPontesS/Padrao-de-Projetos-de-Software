package factory_method.exercicio3;

public class LeitorYAML extends LeitorConfiguracao {
    @Override
    public void lerConfiguracao(String arquivo) {
        System.out.println("Lendo arquivo YAML de configuração: " + arquivo);
        
    }
}