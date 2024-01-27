package decorator.exercicio1;

public class AcucarDecorator extends DecoradorCafe {
 public AcucarDecorator(Cafe cafeDecorado) {
     super(cafeDecorado);
 }

 @Override
 public void preparar() {
     super.preparar();
     adicionarAcucar();
 }

 private void adicionarAcucar() {
     System.out.println("Adicionando açúcar ao café.");
 }
}
