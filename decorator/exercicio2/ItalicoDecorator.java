package decorator.exercicio2;

public class ItalicoDecorator extends DecoradorTexto {
 public ItalicoDecorator(Texto textoDecorado) {
     super(textoDecorado);
 }

 @Override
 public void render() {
     System.out.print("<i>");
     super.render();
     System.out.print("</i>");
 }
}
