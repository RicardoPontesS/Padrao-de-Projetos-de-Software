package observer.exercicio2;

public class ObservadorTemperaturaImpl implements ObservadorTemperatura {
 @Override
 public void onTemperaturaAlterada(double novaTemperatura) {
     System.out.println("Alerta de temperatura: " + novaTemperatura + " graus Celsius");
 }
}
