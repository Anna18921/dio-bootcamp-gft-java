import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<Conta>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta c) {
        this.contas.add(c);
    }

    @Override
    public String toString() {

        String string = "Banco{" +
                "nome: '" + this.getNome()+"'";

        for (Conta conta: this.getContas()) {
                string += ", conta" + (conta.getNumero()+1) +" : " + conta.getNumero();

        }
        return string + "}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
