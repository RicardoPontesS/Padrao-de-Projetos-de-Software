package factory_method.exercicio1;

public class PDF extends Documento {
    @Override
    public void carregar() {
        System.out.println("Carregando documento PDF...");
    }
}