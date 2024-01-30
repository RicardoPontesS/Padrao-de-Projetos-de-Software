package factory_method.exercicio1;

public class HTML extends Documento {
    @Override
    public void carregar() {
        System.out.println("Carregando documento HTML...");
    }
}