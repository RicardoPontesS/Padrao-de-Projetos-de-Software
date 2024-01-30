package abstract_factory.exercicio2;

public class FabricaEstiloModerno implements FabricaWidget {
    @Override
    public Widget criarBotao() {
        return new BotaoModerno();
    }

    @Override
    public Widget criarCaixaTexto() {
        return new CaixaTextoModerno();
    }

    @Override
    public Widget criarMenu() {
        return new MenuModerno();
    }
}