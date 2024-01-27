package decorator.exercicio5;

public class CampoSelecaoDecorator extends DecoradorFormulario {
 private String opcoes[];

 public CampoSelecaoDecorator(Formulario formularioDecorado, String[] opcoes) {
     super(formularioDecorado);
     this.opcoes = opcoes;
 }

 @Override
 public void render() {
     System.out.println("Adicionando campo de sele��o com op��es: " + String.join(", ", opcoes));
     super.render();
 }
}
