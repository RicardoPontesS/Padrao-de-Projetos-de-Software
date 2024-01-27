package facade.adaptere.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        BaseDeDados baseDeDados = new BaseDeDados();
        ClienteFacade clienteFacade = new ClienteFacade(baseDeDados);

        Modelo novoModelo = new Modelo();
        clienteFacade.cadastrarModelo(novoModelo);

        int idModelo = 1;
        Modelo modeloRecuperado = clienteFacade.recuperarModelo(idModelo);
        
        clienteFacade.atualizarModelo(modeloRecuperado);

        clienteFacade.removerModelo(modeloRecuperado);
    }
}
