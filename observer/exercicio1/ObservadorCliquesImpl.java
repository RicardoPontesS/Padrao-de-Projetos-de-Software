package observer.exercicio1;

public class ObservadorCliquesImpl implements ObservadorCliques {
 @Override
 public void onContagemCliquesAlterada(int novaContagemCliques) {
     System.out.println("N�mero de cliques alterado para: " + novaContagemCliques);
 }
}

