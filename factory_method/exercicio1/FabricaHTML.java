package factory_method.exercicio1;

public class FabricaHTML implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new HTML();
    }
}
