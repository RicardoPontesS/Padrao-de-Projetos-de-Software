package abstract_factory.exercicio2;

public class Main {
    public static void main(String[] args) {
        FabricaWidget fabricaModerna = new FabricaEstiloModerno();
        FabricaWidget fabricaClassica = new FabricaEstiloClassico();

        Widget botaoModerno = fabricaModerna.criarBotao();
        Widget caixaTextoClassica = fabricaClassica.criarCaixaTexto();

        botaoModerno.exibir();
        caixaTextoClassica.exibir();
    }
}