package decorator.exercicio5;

public class ExemploDecoratorFormulario {
 public static void main(String[] args) {
     Formulario formularioSimples = new FormularioBasico();
     Formulario formularioComTexto = new CampoTextoDecorator(formularioSimples, "Nome");
     Formulario formularioComSelecao = new CampoSelecaoDecorator(formularioComTexto, new String[]{"Opção 1", "Opção 2", "Opção 3"});
     Formulario formularioCompleto = new CampoDataDecorator(formularioComSelecao, "Data de Nascimento");

     System.out.println("Formulário Básico:");
     formularioSimples.render();

     System.out.println("\nFormulário com Campo de Texto:");
     formularioComTexto.render();

     System.out.println("\nFormulário com Campo de Seleção:");
     formularioComSelecao.render();

     System.out.println("\nFormulário Completo:");
     formularioCompleto.render();
 }
}
