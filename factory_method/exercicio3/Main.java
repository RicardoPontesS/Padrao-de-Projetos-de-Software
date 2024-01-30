package factory_method.exercicio3;

public class Main {
    public static void main(String[] args) {
        FabricaLeitorConfiguracao fabricaJSON = new FabricaJSON();
        FabricaLeitorConfiguracao fabricaXML = new FabricaXML();
        FabricaLeitorConfiguracao fabricaYAML = new FabricaYAML();

        LeitorConfiguracao leitorJSON = fabricaJSON.criarLeitorConfiguracao();
        LeitorConfiguracao leitorXML = fabricaXML.criarLeitorConfiguracao();
        LeitorConfiguracao leitorYAML = fabricaYAML.criarLeitorConfiguracao();

        leitorJSON.lerConfiguracao("config.json");
        leitorXML.lerConfiguracao("config.xml");
        leitorYAML.lerConfiguracao("config.yaml");
    }
}