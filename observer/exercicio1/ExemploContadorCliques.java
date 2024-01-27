package observer.exercicio1;

public class ExemploContadorCliques {
 public static void main(String[] args) {
     ContadorCliques contadorCliques = new ContadorCliques();
     ObservadorCliques observador = new ObservadorCliquesImpl();

     contadorCliques.adicionarObservador(observador);

     for (int i = 0; i < 5; i++) {
         contadorCliques.incrementarContagemCliques();
     }

     contadorCliques.removerObservador(observador);

     for (int i = 0; i < 3; i++) {
         contadorCliques.incrementarContagemCliques();
     }
 }
}
