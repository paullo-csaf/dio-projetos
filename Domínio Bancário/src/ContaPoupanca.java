public class ContaPoupanca extends AtributoConta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirAtributos();
    }

}
