package pps.geral.exercicio3;

import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        HamburguerBuilder builder = new HamburguerBuilder();

        List<String> hamburguerPersonalizado = builder
                .adicionarPao("Integral")
                .adicionarCarne("Frango")
                .adicionarQueijo("Cheddar")
                .adicionarMolho("Barbecue")
                .construir();

        System.out.println("Hambúrguer Personalizado:");
        for (String ingrediente : hamburguerPersonalizado) {
            System.out.println("- " + ingrediente);
        }
    }
}
