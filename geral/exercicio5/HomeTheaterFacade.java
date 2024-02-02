package pps.geral.exercicio5;

public class HomeTheaterFacade {
    private Televisao tv;
    private SomSurround somSurround;
    private SintonizadorTV sintonizadorTV;

    public HomeTheaterFacade(Televisao tv, SomSurround somSurround, SintonizadorTV sintonizadorTV) {
        this.tv = tv;
        this.somSurround = somSurround;
        this.sintonizadorTV = sintonizadorTV;
    }

    public void ligarSistema() {
        tv.ligar();
        somSurround.ligar();
        sintonizadorTV.ligar();
    }

    public void desligarSistema() {
        tv.desligar();
        somSurround.desligar();
        sintonizadorTV.desligar();
    }

    public void assistirTV() {
        ligarSistema();
        sintonizadorTV.sintonizarCanal("Canal A");
    }

    public void ouvirSom() {
        ligarSistema();
        somSurround.configurarVolume(20);
    }
}