package observer.exercicio4;

public class ObservadorEstoqueImpl implements ObservadorEstoque {
 @Override
 public void onQuantidadeProdutoAlterada(String produto, int novaQuantidade) {
     System.out.println("Quantidade do produto " + produto + " alterada para: " + novaQuantidade);
 }
}
