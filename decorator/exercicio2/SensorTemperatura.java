package decorator.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
 private double temperatura;
 private List<ObservadorTemperatura> observadores = new ArrayList<>();

 public void adicionarObservador(ObservadorTemperatura observador) {
     observadores.add(observador);
 }

 public void removerObservador(ObservadorTemperatura observador) {
     observadores.remove(observador);
 }

 public void setTemperatura(double novaTemperatura) {
     temperatura = novaTemperatura;
     notificarObservadores();
 }

 public double getTemperatura() {
     return temperatura;
 }

 private void notificarObservadores() {
     for (ObservadorTemperatura observador : observadores) {
         observador.onTemperaturaAlterada(temperatura);
     }
 }
}
