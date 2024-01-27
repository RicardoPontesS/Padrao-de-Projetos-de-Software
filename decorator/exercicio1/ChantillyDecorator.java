package decorator.exercicio1;

public class ChantillyDecorator extends DecoradorCafe {
 public ChantillyDecorator(Cafe cafeDecorado) {
     super(cafeDecorado);
 }

 @Override
 public void preparar() {
     super.preparar();
     adicionarChantilly();
 }

 private void adicionarChantilly() {
     System.out.println("Adicionando chantilly ao café.");
 }
}
