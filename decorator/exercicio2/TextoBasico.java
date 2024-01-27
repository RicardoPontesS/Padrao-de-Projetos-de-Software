package decorator.exercicio2;

public class TextoBasico implements Texto {
 private String conteudo;

 public TextoBasico(String conteudo) {
     this.conteudo = conteudo;
 }

 @Override
 public void render() {
     System.out.print(conteudo);
 }
}
