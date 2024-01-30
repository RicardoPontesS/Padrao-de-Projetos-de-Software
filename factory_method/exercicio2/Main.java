package factory_method.exercicio2;

public class Main {
    public static void main(String[] args) {
        FabricaInimigo fabricaSoldado = new FabricaSoldado();
        FabricaInimigo fabricaMonstro = new FabricaMonstro();
        FabricaInimigo fabricaChefe = new FabricaChefe();

        Inimigo soldado = fabricaSoldado.criarInimigo();
        Inimigo monstro = fabricaMonstro.criarInimigo();
        Inimigo chefe = fabricaChefe.criarInimigo();

        soldado.atacar();
        monstro.atacar();
        chefe.atacar();
    }
}
