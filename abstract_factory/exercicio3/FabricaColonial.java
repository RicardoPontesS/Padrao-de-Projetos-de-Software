package abstract_factory.exercicio3;

public class FabricaColonial implements FabricaPartesCasa {
    @Override
    public Fundacao criarFundacao() {
        return new FundacaoColonial();
    }

    @Override
    public Paredes criarParedes() {
        return new ParedesColoniais();
    }

    @Override
    public Telhado criarTelhado() {
        return new TelhadoColonial();
    }
}