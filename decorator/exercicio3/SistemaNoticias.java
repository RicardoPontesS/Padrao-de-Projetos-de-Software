package decorator.exercicio3;

public class SistemaNoticias {
 public static void main(String[] args) {
     AgenciaNoticias agencia = new AgenciaNoticias();
     ObservadorNoticias observador = new ObservadorNoticiasImpl();

     agencia.adicionarObservador(observador);

     agencia.publicarNoticia("Lançamento de um novo produto!");

     agencia.removerObservador(observador);

     agencia.publicarNoticia("Resultado de uma pesquisa recente!");
 }
}

