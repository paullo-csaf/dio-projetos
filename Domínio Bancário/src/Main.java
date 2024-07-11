public class Main {
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        
        AtributoConta cc = new ContaCorrente(paulo);
        AtributoConta cp = new ContaPoupanca(paulo);

        cc.Depositar(100);
        cc.Transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
