package decorator.exercicio4;

public abstract class DecoradorBotao implements Botao {
 protected Botao botaoDecorado;

 public DecoradorBotao(Botao botaoDecorado) {
     this.botaoDecorado = botaoDecorado;
 }

 @Override
 public void render() {
     botaoDecorado.render();
 }
}
