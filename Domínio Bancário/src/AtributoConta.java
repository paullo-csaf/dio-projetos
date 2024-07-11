public abstract class AtributoConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void Sacar(double valor) {
        saldo -= valor;
    }
    public void Depositar(double valor) {
        saldo += valor;
    }
    public void Transferir(double valor, AtributoConta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public AtributoConta(Cliente cliente) {
        this.agencia = AtributoConta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void imprimirExtrato() {}

    protected void imprimirAtributos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
