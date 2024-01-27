package observer.exercicio3;

public class ObservadorNoticiasImpl implements ObservadorNoticias {
 @Override
 public void onNovaNoticia(String novaNoticia) {
     System.out.println("Nova notícia: " + novaNoticia);
 }
}

