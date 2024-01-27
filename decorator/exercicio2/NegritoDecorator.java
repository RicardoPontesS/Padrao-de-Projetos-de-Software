package decorator.exercicio2;


public class NegritoDecorator extends DecoradorTexto {
 public NegritoDecorator(Texto textoDecorado) {
     super(textoDecorado);
 }

 @Override
 public void render() {
     System.out.print("<b>");
     super.render();
     System.out.print("</b>");
 }
}

