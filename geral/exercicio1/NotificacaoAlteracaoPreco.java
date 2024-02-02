package pps.geral.exercicio1;

public class NotificacaoAlteracaoPreco {
    public static void main(String[] args) {

        AssuntoPreco precoProduto = new AssuntoPreco();

        ObservadorPreco cliente1 = new Cliente("Cliente A");
        ObservadorPreco cliente2 = new Cliente("Cliente B");

        precoProduto.adicionarObservador(cliente1);
        precoProduto.adicionarObservador(cliente2);

        precoProduto.setPreco(50.0);

        precoProduto.removerObservador(cliente1);

        precoProduto.setPreco(45.0);
    }
}
