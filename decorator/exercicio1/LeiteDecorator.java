package decorator.exercicio1;

public class LeiteDecorator extends DecoradorCafe {
 public LeiteDecorator(Cafe cafeDecorado) {
     super(cafeDecorado);
 }

 @Override
 public void preparar() {
     super.preparar();
     adicionarLeite();
 }

 private void adicionarLeite() {
     System.out.println("Adicionando leite ao café.");
 }
}
