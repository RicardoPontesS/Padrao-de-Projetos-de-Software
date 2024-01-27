package decorator.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias {
 private List<ObservadorNoticias> observadores = new ArrayList<>();
 private String ultimaNoticia;

 public void adicionarObservador(ObservadorNoticias observador) {
     observadores.add(observador);
 }

 public void removerObservador(ObservadorNoticias observador) {
     observadores.remove(observador);
 }

 public void publicarNoticia(String novaNoticia) {
     ultimaNoticia = novaNoticia;
     notificarObservadores();
 }

 public String getUltimaNoticia() {
     return ultimaNoticia;
 }

 private void notificarObservadores() {
     for (ObservadorNoticias observador : observadores) {
         observador.onNovaNoticia(ultimaNoticia);
     }
 }
}
