package observer.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ContadorCliques {
 private int contagemCliques = 0;
 private List<ObservadorCliques> observadores = new ArrayList<>();

 public void adicionarObservador(ObservadorCliques observador) {
     observadores.add(observador);
 }

 public void removerObservador(ObservadorCliques observador) {
     observadores.remove(observador);
 }

 public void incrementarContagemCliques() {
     contagemCliques++;
     notificarObservadores();
 }

 public int getContagemCliques() {
     return contagemCliques;
 }

 private void notificarObservadores() {
     for (ObservadorCliques observador : observadores) {
         observador.onContagemCliquesAlterada(contagemCliques);
     }
 }
}
