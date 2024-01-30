package factory_method.exercicio1;

public class FabricaPDF implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new PDF();
    }
}
