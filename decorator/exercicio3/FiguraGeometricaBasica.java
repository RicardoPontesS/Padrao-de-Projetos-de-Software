package decorator.exercicio3;

public class FiguraGeometricaBasica implements FiguraGeometrica {
 private String tipo;

 public FiguraGeometricaBasica(String tipo) {
     this.tipo = tipo;
 }

 @Override
 public void desenhar() {
     System.out.println("Desenhando " + tipo);
 }
}

