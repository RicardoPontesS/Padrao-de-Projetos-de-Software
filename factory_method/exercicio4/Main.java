package factory_method.exercicio4;

public class Main {
    public static void main(String[] args) {
        FabricaEvento fabricaErro = new FabricaEventoErro();
        FabricaEvento fabricaAviso = new FabricaEventoAviso();
        FabricaEvento fabricaInformativo = new FabricaEventoInformativo();

        Evento eventoErro = fabricaErro.criarEvento();
        Evento eventoAviso = fabricaAviso.criarEvento();
        Evento eventoInformativo = fabricaInformativo.criarEvento();

        System.out.println(eventoErro.getDescricao());
        System.out.println(eventoAviso.getDescricao());
        System.out.println(eventoInformativo.getDescricao());
    }
}
