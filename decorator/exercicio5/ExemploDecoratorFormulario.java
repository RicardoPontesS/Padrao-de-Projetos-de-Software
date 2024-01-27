package decorator.exercicio5;

public class ExemploDecoratorFormulario {
 public static void main(String[] args) {
     Formulario formularioSimples = new FormularioBasico();
     Formulario formularioComTexto = new CampoTextoDecorator(formularioSimples, "Nome");
     Formulario formularioComSelecao = new CampoSelecaoDecorator(formularioComTexto, new String[]{"Op��o 1", "Op��o 2", "Op��o 3"});
     Formulario formularioCompleto = new CampoDataDecorator(formularioComSelecao, "Data de Nascimento");

     System.out.println("Formul�rio B�sico:");
     formularioSimples.render();

     System.out.println("\nFormul�rio com Campo de Texto:");
     formularioComTexto.render();

     System.out.println("\nFormul�rio com Campo de Sele��o:");
     formularioComSelecao.render();

     System.out.println("\nFormul�rio Completo:");
     formularioCompleto.render();
 }
}
