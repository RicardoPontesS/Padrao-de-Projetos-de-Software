package decorator.exercicio2;

public class FonteDecorator extends DecoradorTexto {
 private String fonte;

 public FonteDecorator(Texto textoDecorado, String fonte) {
     super(textoDecorado);
     this.fonte = fonte;
 }

 @Override
 public void render() {
     System.out.print("<font face='" + fonte + "'>");
     super.render();
     System.out.print("</font>");
 }
}
