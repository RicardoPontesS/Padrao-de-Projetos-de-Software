package decorator.exercicio3;

public abstract class DecoradorFiguraGeometrica implements FiguraGeometrica {
 protected FiguraGeometrica figuraDecorada;

 public DecoradorFiguraGeometrica(FiguraGeometrica figuraDecorada) {
     this.figuraDecorada = figuraDecorada;
 }

 @Override
 public void desenhar() {
     figuraDecorada.desenhar();
 }
}

