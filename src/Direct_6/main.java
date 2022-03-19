package Direct_6;

public class main {
    public static void main(String[] args) {
        Cliente jeferson = new Cliente();
        jeferson.setNome("jeferson");

        Conta cc = new ContaCorrente(jeferson);
        cc.depositar(2500);

        Conta poupanca = new ContaPoupanca(jeferson);
        cc.transferir(572, poupanca );

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
