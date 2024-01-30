package factory_method.exercicio1;

public class Word extends Documento {
    @Override
    public void carregar() {
        System.out.println("Carregando documento Word...");
    }
}
