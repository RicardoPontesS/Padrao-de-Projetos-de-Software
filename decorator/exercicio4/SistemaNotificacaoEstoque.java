package decorator.exercicio4;

public class SistemaNotificacaoEstoque {
 public static void main(String[] args) {
     SistemaEstoque estoque = new SistemaEstoque("ProdutoA", 50);
     ObservadorEstoque observador = new ObservadorEstoqueImpl();

     estoque.adicionarObservador(observador);

     estoque.atualizarQuantidadeProduto(40);

     estoque.removerObservador(observador);

     estoque.atualizarQuantidadeProduto(30);
 }
}

