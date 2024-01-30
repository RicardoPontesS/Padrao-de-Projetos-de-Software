package abstract_factory.exercicio3;

public interface FabricaPartesCasa {
    Fundacao criarFundacao();
    Paredes criarParedes();
    Telhado criarTelhado();
}
