package facade.adaptere.exercicio2;

public class Adapter {
    private BaseDeDadosExistente baseExistente;

    public Adapter(BaseDeDadosExistente baseExistente) {
        this.baseExistente = baseExistente;
    }

    public void operacaoAdaptada() {
        System.out.println("Utilizando o adaptador para realizar operação adaptada");
        baseExistente.operacaoExistente();
    }
}
