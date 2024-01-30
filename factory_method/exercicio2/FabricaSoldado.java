package factory_method.exercicio2;

public class FabricaSoldado implements FabricaInimigo {
    @Override
    public Inimigo criarInimigo() {
        return new Soldado();
    }
}