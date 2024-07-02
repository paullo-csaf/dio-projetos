public interface AparelhoTelefônico {

    static void ligar(String numero) {
        System.out.println("Ligando o para o número " + numero + ".");
    }

    static void atender() {
        System.out.println("Chamada atendida.");
    }

    static void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");
    }
}