package decorator.exercicio4;

public class BordaTracejadaDecorator extends DecoradorBotao {
 public BordaTracejadaDecorator(Botao botaoDecorado) {
     super(botaoDecorado);
 }

 @Override
 public void render() {
     System.out.println("Renderizando bot�o com borda tracejada.");
     super.render();
 }
}

