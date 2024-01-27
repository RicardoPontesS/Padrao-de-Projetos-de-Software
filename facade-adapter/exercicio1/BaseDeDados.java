package facade.adaptere.exercicio1;

public class BaseDeDados {
    public void cadastrar(Modelo modelo) {
        System.out.println("Cadastrando modelo na base de dados");
    }

    public Modelo recuperar(int id) {
        System.out.println("Recuperando modelo da base de dados");
        return null;
    }

    public void atualizar(Modelo modelo) {
        System.out.println("Atualizando modelo na base de dados");
    }

    public void remover(Modelo modelo) {
        System.out.println("Removendo modelo da base de dados");
    }
}
