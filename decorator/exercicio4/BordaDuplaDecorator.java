package decorator.exercicio4;

public class BordaDuplaDecorator extends DecoradorBotao {
 public BordaDuplaDecorator(Botao botaoDecorado) {
     super(botaoDecorado);
 }

 @Override
 public void render() {
     System.out.println("Renderizando bot�o com borda dupla.");
     super.render();
 }
}
