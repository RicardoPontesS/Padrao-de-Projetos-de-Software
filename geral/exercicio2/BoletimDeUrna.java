package pps.geral.exercicio2;

public class BoletimDeUrna implements ObservadorVoto {
    private int totalVotos = 0;

    @Override
    public void atualizar(String candidato) {
        totalVotos++;
        System.out.println("Boletim de Urna: Candidato '" + candidato + "' recebeu um voto. Total de votos: " + totalVotos);
    }
}