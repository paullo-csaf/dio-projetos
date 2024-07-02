public interface Navegador{

    static void exibirPagina(String URL) {
        System.out.println(URL);
    }

    static void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    static void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}