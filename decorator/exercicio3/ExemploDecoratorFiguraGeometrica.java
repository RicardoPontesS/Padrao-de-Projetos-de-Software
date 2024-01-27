package decorator.exercicio3;

public class ExemploDecoratorFiguraGeometrica {
 public static void main(String[] args) {
     FiguraGeometrica figuraRetangulo = new FiguraGeometricaBasica("Retângulo");
     FiguraGeometrica figuraCirculo = new FiguraGeometricaBasica("Círculo");

     FiguraGeometrica retanguloPreto = new CorDecorator(figuraRetangulo, "Preto");
     FiguraGeometrica circuloVermelho = new CorDecorator(figuraCirculo, "Vermelho");

     System.out.println("Figura Geométrica Básica:");
     figuraRetangulo.desenhar();

     System.out.println("\nFigura Geométrica Decorada - Cor Preto:");
     retanguloPreto.desenhar();

     System.out.println("\nFigura Geométrica Básica:");
     figuraCirculo.desenhar();

     System.out.println("\nFigura Geométrica Decorada - Cor Vermelho:");
     circuloVermelho.desenhar();
 }
}
