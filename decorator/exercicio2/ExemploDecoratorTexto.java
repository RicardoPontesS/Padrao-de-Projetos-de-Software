package decorator.exercicio2;

public class ExemploDecoratorTexto {
 public static void main(String[] args) {
     Texto textoSimples = new TextoBasico("Texto simples.");

     Texto textoNegrito = new NegritoDecorator(textoSimples);
     Texto textoItalico = new ItalicoDecorator(textoSimples);
     Texto textoSublinhado = new SublinhadoDecorator(textoSimples);
     Texto textoFonte = new FonteDecorator(textoSimples, "Arial");

     System.out.println("Texto Simples:");
     textoSimples.render();

     System.out.println("\n\nTexto Negrito:");
     textoNegrito.render();

     System.out.println("\n\nTexto Itálico:");
     textoItalico.render();

     System.out.println("\n\nTexto Sublinhado:");
     textoSublinhado.render();

     System.out.println("\n\nTexto com Fonte Arial:");
     textoFonte.render();
 }
}
