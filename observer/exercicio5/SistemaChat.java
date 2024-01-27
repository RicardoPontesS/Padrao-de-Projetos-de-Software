package observer.exercicio5;

public class SistemaChat {
 public static void main(String[] args) {
     SalaChat sala = new SalaChat();

     ObservadorChat observador1 = new ObservadorChatImpl("Cliente1");
     ObservadorChat observador2 = new ObservadorChatImpl("Cliente2");

     sala.adicionarObservador(observador1);
     sala.adicionarObservador(observador2);

     sala.enviarMensagem("Cliente1", "Olá, alguém está aí?");
     sala.enviarMensagem("Cliente2", "Sim, estou aqui!");
     sala.enviarMensagem("Cliente1", "Como você está?");
 }
}

