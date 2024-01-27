package decorator.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class SistemaEstoque {
 private List<ObservadorEstoque> observadores = new ArrayList<>();
 private int quantidadeProduto;
 private String nomeProduto;

 public SistemaEstoque(String nomeProduto, int quantidadeInicial) {
     this.nomeProduto = nomeProduto;
     this.quantidadeProduto = quantidadeInicial;
 }

 public void adicionarObservador(ObservadorEstoque observador) {
     observadores.add(observador);
 }

 public void removerObservador(ObservadorEstoque observador) {
     observadores.remove(observador);
 }

 public void atualizarQuantidadeProduto(int novaQuantidade) {
     quantidadeProduto = novaQuantidade;
     notificarObservadores();
 }

 public int getQuantidadeProduto() {
     return quantidadeProduto;
 }

 public String getNomeProduto() {
     return nomeProduto;
 }

 private void notificarObservadores() {
     for (ObservadorEstoque observador : observadores) {
         observador.onQuantidadeProdutoAlterada(nomeProduto, quantidadeProduto);
     }
 }
}
