package abstract_factory.exercicio2;

public class FabricaEstiloClassico implements FabricaWidget {
    @Override
    public Widget criarBotao() {
        return new BotaoClassico();
    }

    @Override
    public Widget criarCaixaTexto() {
        return new CaixaTextoClassico();
    }

    @Override
    public Widget criarMenu() {
        return new MenuClassico();
    }
}