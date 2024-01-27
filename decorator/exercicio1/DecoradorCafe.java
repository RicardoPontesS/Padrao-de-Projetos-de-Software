package decorator.exercicio1;

public abstract class DecoradorCafe implements Cafe {
 protected Cafe cafeDecorado;

 public DecoradorCafe(Cafe cafeDecorado) {
     this.cafeDecorado = cafeDecorado;
 }

 @Override
 public void preparar() {
     cafeDecorado.preparar();
 }
}
