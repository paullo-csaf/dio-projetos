public class ContaCorrente extends AtributoConta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirAtributos();
    }
}
