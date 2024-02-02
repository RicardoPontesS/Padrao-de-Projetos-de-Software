package pps.geral.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class UrnaEletronica {
    private List<ObservadorVoto> observadores = new ArrayList<>();
    private List<String> candidatos = new ArrayList<>();

    public void adicionarObservador(ObservadorVoto observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorVoto observador) {
        observadores.remove(observador);
    }

    public void adicionarCandidato(String candidato) {
        candidatos.add(candidato);
    }

    public void votar(String candidato) {
        if (candidatos.contains(candidato)) {
            notificarObservadores(candidato);
        } else {
            System.out.println("Candidato inválido!");
        }
    }

    private void notificarObservadores(String candidato) {
        for (ObservadorVoto observador : observadores) {
            observador.atualizar(candidato);
        }
    }
}
