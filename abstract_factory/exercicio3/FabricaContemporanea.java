package abstract_factory.exercicio3;

public class FabricaContemporanea implements FabricaPartesCasa {
    @Override
    public Fundacao criarFundacao() {
        return new FundacaoContemporanea();
    }

    @Override
    public Paredes criarParedes() {
        return new ParedesContemporaneas();
    }

    @Override
    public Telhado criarTelhado() {
        return new TelhadoContemporaneo();
    }
}