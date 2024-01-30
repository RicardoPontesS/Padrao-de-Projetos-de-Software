package abstract_factory.exercicio3;

public class Main {
    public static void main(String[] args) {
        FabricaPartesCasa fabricaContemporanea = new FabricaContemporanea();
        FabricaPartesCasa fabricaColonial = new FabricaColonial();

        Fundacao fundacaoContemporanea = fabricaContemporanea.criarFundacao();
        Paredes paredesColonial = fabricaColonial.criarParedes();
        Telhado telhadoContemporaneo = fabricaContemporanea.criarTelhado();

        fundacaoContemporanea.construir();
        paredesColonial.construir();
        telhadoContemporaneo.construir();
    }
}