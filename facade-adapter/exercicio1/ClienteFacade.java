package facade.adaptere.exercicio1;

public class ClienteFacade {
    private BaseDeDados baseDeDados;

    public ClienteFacade(BaseDeDados baseDeDados) {
        this.baseDeDados = baseDeDados;
    }

    public void cadastrarModelo(Modelo modelo) {
        baseDeDados.cadastrar(modelo);
    }

    public Modelo recuperarModelo(int id) {
        return baseDeDados.recuperar(id);
    }

    public void atualizarModelo(Modelo modelo) {
        baseDeDados.atualizar(modelo);
    }

    public void removerModelo(Modelo modelo) {
        baseDeDados.remover(modelo);
    }
}
