package facade.adaptere.exercicio2;

public class Cliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        BaseDeDadosExistente baseExistente = new BaseDeDadosExistente();
        Adapter adapter = new Adapter(baseExistente);

        
        cliente.operacaoComAdapter(adapter);
    }

    public void operacaoComAdapter(Adapter adapter) {
        System.out.println("Cliente realiza operação com o adaptador");
        adapter.operacaoAdaptada();
    }
}
