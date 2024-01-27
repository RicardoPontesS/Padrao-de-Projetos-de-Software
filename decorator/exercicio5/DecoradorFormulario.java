package decorator.exercicio5;

public abstract class DecoradorFormulario implements Formulario {
 protected Formulario formularioDecorado;

 public DecoradorFormulario(Formulario formularioDecorado) {
     this.formularioDecorado = formularioDecorado;
 }

 @Override
 public void render() {
     formularioDecorado.render();
 }
}

