package observer.exercicio5;


public class ObservadorChatImpl implements ObservadorChat {
 private String nomeCliente;

 public ObservadorChatImpl(String nomeCliente) {
     this.nomeCliente = nomeCliente;
 }

 @Override
 public void onNovaMensagem(String remetente, String mensagem) {
     if (!remetente.equals(nomeCliente)) {
         System.out.println("[" + nomeCliente + "]: Nova mensagem de [" + remetente + "]: " + mensagem);
     }
 }
}

