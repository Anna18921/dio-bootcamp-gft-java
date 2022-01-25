public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        Banco banco = new Banco();

        banco.setNome("Teste Banco");
        banco.setContas(cc);
        banco.setContas(cp);

        String s = banco.toString();

        System.out.println(s);

    }
}
