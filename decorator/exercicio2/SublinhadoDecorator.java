package decorator.exercicio2;

public class SublinhadoDecorator extends DecoradorTexto {
 public SublinhadoDecorator(Texto textoDecorado) {
     super(textoDecorado);
 }

 @Override
 public void render() {
     System.out.print("<u>");
     super.render();
     System.out.print("</u>");
 }
}

