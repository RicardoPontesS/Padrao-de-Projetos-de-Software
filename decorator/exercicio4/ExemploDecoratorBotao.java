package decorator.exercicio4;

public class ExemploDecoratorBotao {
 public static void main(String[] args) {
     Botao botaoSimples = new BotaoBasico();
     Botao botaoComBordaSimples = new BordaSimplesDecorator(botaoSimples);
     Botao botaoComBordaDupla = new BordaDuplaDecorator(botaoSimples);
     Botao botaoComBordaTracejada = new BordaTracejadaDecorator(botaoSimples);

     System.out.println("Botão Básico:");
     botaoSimples.render();

     System.out.println("\nBotão com Borda Simples:");
     botaoComBordaSimples.render();

     System.out.println("\nBotão com Borda Dupla:");
     botaoComBordaDupla.render();

     System.out.println("\nBotão com Borda Tracejada:");
     botaoComBordaTracejada.render();
 }
}

