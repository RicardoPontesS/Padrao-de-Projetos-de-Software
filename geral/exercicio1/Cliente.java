package pps.geral.exercicio1;

public class Cliente implements ObservadorPreco {
 private String nome;

 public Cliente(String nome) {
     this.nome = nome;
 }

 @Override
 public void atualizar(double novoPreco) {
     System.out.println(nome + ", o preço do produto que você está acompanhando foi alterado para: " + novoPreco);
 }
}
