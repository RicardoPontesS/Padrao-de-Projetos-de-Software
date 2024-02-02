package pps.geral.exercicio2;

public class SistemaEleitoral {
    public static void main(String[] args) {
        UrnaEletronica urna = new UrnaEletronica();

        ObservadorVoto boletim1 = new BoletimDeUrna();
        ObservadorVoto boletim2 = new BoletimDeUrna();

        urna.adicionarObservador(boletim1);
        urna.adicionarObservador(boletim2);

        urna.adicionarCandidato("Candidato A");
        urna.adicionarCandidato("Candidato B");


        urna.votar("Candidato A");
        urna.votar("Candidato B");
        urna.votar("Candidato A");

        urna.removerObservador(boletim1);

        urna.votar("Candidato B");
    }
}
