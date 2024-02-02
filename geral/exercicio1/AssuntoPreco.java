package pps.geral.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class AssuntoPreco {
    private List<ObservadorPreco> observadores = new ArrayList<>();
    private double precoAtual;

    public void adicionarObservador(ObservadorPreco observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorPreco observador) {
        observadores.remove(observador);
    }

    public void setPreco(double novoPreco) {
        if (novoPreco != precoAtual) {
            precoAtual = novoPreco;
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        for (ObservadorPreco observador : observadores) {
            observador.atualizar(precoAtual);
        }
    }
}
