package decorator.exercicio2;

public abstract class DecoradorTexto implements Texto {
 protected Texto textoDecorado;

 public DecoradorTexto(Texto textoDecorado) {
     this.textoDecorado = textoDecorado;
 }

 @Override
 public void render() {
     textoDecorado.render();
 }
}
