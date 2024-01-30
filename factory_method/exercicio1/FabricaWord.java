package factory_method.exercicio1;

public class FabricaWord implements FabricaDocumento {
    @Override
    public Documento criarDocumento() {
        return new Word();
    }
}