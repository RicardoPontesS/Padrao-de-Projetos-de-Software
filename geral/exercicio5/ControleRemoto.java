package pps.geral.exercicio5;

public class ControleRemoto {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        SomSurround somSurround = new SomSurround();
        SintonizadorTV sintonizadorTV = new SintonizadorTV();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, somSurround, sintonizadorTV);

        System.out.println("----- Assistindo TV -----");
        homeTheater.assistirTV();

        System.out.println("\n----- Ouvindo Som -----");
        homeTheater.ouvirSom();
    }
}