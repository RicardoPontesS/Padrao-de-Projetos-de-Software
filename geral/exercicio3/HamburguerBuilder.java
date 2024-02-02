package pps.geral.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class HamburguerBuilder {
    private List<String> ingredientes = new ArrayList<>();

    public HamburguerBuilder adicionarPao(String tipoPao) {
        ingredientes.add("Pão: " + tipoPao);
        return this;
    }

    public HamburguerBuilder adicionarCarne(String tipoCarne) {
        ingredientes.add("Carne: " + tipoCarne);
        return this;
    }

    public HamburguerBuilder adicionarQueijo(String tipoQueijo) {
        ingredientes.add("Queijo: " + tipoQueijo);
        return this;
    }

    public HamburguerBuilder adicionarMolho(String tipoMolho) {
        ingredientes.add("Molho: " + tipoMolho);
        return this;
    }

    public List<String> construir() {
        return ingredientes;
    }
}

