package decorator.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class SalaChat {
 private List<ObservadorChat> observadores = new ArrayList<>();

 public void adicionarObservador(ObservadorChat observador) {
     observadores.add(observador);
 }

 public void removerObservador(ObservadorChat observador) {
     observadores.remove(observador);
 }

 public void enviarMensagem(String remetente, String mensagem) {
     System.out.println("[" + remetente + "]: " + mensagem);

     notificarObservadores(remetente, mensagem);
 }

 private void notificarObservadores(String remetente, String mensagem) {
     for (ObservadorChat observador : observadores) {
         observador.onNovaMensagem(remetente, mensagem);
     }
 }
}

