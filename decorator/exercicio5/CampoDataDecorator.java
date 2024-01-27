package decorator.exercicio5;

public class CampoDataDecorator extends DecoradorFormulario {
 private String rotulo;

 public CampoDataDecorator(Formulario formularioDecorado, String rotulo) {
     super(formularioDecorado);
     this.rotulo = rotulo;
 }

 @Override
 public void render() {
     System.out.println("Adicionando campo de data: " + rotulo);
     super.render();
 }
}

