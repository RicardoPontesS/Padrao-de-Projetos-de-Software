package decorator.exercicio2;

public class SistemaAlertaTemperatura {
 public static void main(String[] args) {
     SensorTemperatura sensor = new SensorTemperatura();
     ObservadorTemperatura observador = new ObservadorTemperaturaImpl();

     sensor.adicionarObservador(observador);

     sensor.setTemperatura(25.5);

     sensor.removerObservador(observador);

     sensor.setTemperatura(30.0);
 }
}
