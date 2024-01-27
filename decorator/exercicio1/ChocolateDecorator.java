package decorator.exercicio1;

public class ChocolateDecorator extends DecoradorCafe {
 public ChocolateDecorator(Cafe cafeDecorado) {
     super(cafeDecorado);
 }

 @Override
 public void preparar() {
     super.preparar();
     adicionarChocolate();
 }

 private void adicionarChocolate() {
     System.out.println("Adicionando chocolate ao café.");
 }
}

