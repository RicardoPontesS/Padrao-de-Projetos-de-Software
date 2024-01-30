package factory_method.exercicio2;

public class FabricaChefe implements FabricaInimigo {
    @Override
    public Inimigo criarInimigo() {
        return new Chefe();
    }
}