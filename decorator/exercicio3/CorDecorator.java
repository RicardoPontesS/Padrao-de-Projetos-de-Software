package decorator.exercicio3;

public class CorDecorator extends DecoradorFiguraGeometrica {
 private String cor;

 public CorDecorator(FiguraGeometrica figuraDecorada, String cor) {
     super(figuraDecorada);
     this.cor = cor;
 }

 @Override
 public void desenhar() {
     System.out.println("Desenhando com cor " + cor);
     super.desenhar();
 }
}

