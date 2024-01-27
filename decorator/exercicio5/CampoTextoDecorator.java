package decorator.exercicio5;

public class CampoTextoDecorator extends DecoradorFormulario {
 private String rotulo;

 public CampoTextoDecorator(Formulario formularioDecorado, String rotulo) {
     super(formularioDecorado);
     this.rotulo = rotulo;
 }

 @Override
 public void render() {
     System.out.println("Adicionando campo de texto: " + rotulo);
     super.render();
 }
}
