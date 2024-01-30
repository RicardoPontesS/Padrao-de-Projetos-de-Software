package factory_method.exercicio2;

public class FabricaMonstro implements FabricaInimigo {
    @Override
    public Inimigo criarInimigo() {
        return new Monstro();
    }
}