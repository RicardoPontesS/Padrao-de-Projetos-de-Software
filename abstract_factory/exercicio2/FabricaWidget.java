package abstract_factory.exercicio2;

public interface FabricaWidget {
    Widget criarBotao();
    Widget criarCaixaTexto();
    Widget criarMenu();
}