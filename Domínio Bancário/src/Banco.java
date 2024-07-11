import java.util.List;

public class Banco {
    private String nome;
    private List<AtributoConta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AtributoConta> getContas() {
        return contas;
    }

    public void setContas(List<AtributoConta> contas) {
        this.contas = contas;
    }
    
}
