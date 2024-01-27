package decorator.exercicio4;

public class BordaSimplesDecorator extends DecoradorBotao {
 public BordaSimplesDecorator(Botao botaoDecorado) {
     super(botaoDecorado);
 }

 @Override
 public void render() {
     System.out.println("Renderizando bot�o com borda simples.");
     super.render();
 }
}
