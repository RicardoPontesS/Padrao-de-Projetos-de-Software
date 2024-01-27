package decorator.exercicio1;

public class ExemploCafeDecorator {
 public static void main(String[] args) {
     Cafe cafeBasico = new CafeBasico();
     Cafe cafeComLeite = new LeiteDecorator(cafeBasico);
     Cafe cafeComAcucar = new AcucarDecorator(cafeComLeite);
     Cafe cafeComChocolateEChantilly = new ChantillyDecorator(new ChocolateDecorator(cafeComAcucar));

     System.out.println("Caf� B�sico:");
     cafeBasico.preparar();

     System.out.println("\nCaf� com Leite:");
     cafeComLeite.preparar();

     System.out.println("\nCaf� com A��car:");
     cafeComAcucar.preparar();

     System.out.println("\nCaf� com Chocolate e Chantilly:");
     cafeComChocolateEChantilly.preparar();
 }
}

