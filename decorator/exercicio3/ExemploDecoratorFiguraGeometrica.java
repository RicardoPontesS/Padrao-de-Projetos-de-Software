package decorator.exercicio3;

public class ExemploDecoratorFiguraGeometrica {
 public static void main(String[] args) {
     FiguraGeometrica figuraRetangulo = new FiguraGeometricaBasica("Ret�ngulo");
     FiguraGeometrica figuraCirculo = new FiguraGeometricaBasica("C�rculo");

     FiguraGeometrica retanguloPreto = new CorDecorator(figuraRetangulo, "Preto");
     FiguraGeometrica circuloVermelho = new CorDecorator(figuraCirculo, "Vermelho");

     System.out.println("Figura Geom�trica B�sica:");
     figuraRetangulo.desenhar();

     System.out.println("\nFigura Geom�trica Decorada - Cor Preto:");
     retanguloPreto.desenhar();

     System.out.println("\nFigura Geom�trica B�sica:");
     figuraCirculo.desenhar();

     System.out.println("\nFigura Geom�trica Decorada - Cor Vermelho:");
     circuloVermelho.desenhar();
 }
}
