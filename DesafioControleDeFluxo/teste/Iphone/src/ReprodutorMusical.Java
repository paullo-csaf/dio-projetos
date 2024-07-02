public class ReprodutorMusical {

    static void tocar() {
        System.out.println("Tocando música.");
    }

    static void pausar() {
        System.out.println("Música pausada.");
    }

    static void selecionarMusica(String musica, String artista) {
        System.out.println(formatarMensagem(String musica, String artista));
    }

    private static String formatarMensagem(String musica, String artista) {
        return "Tocando " + musica + " - " + artista;
    }

    
    public static void main(String[] args) {
        // Teste
        selecionarMusica("Nome da Música", "Nome do Artista");
    }
    
    
}