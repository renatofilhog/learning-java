public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;
    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }
    public void cobrarTarifaMensal(){
        this.saldo -= this.tarifaMensal;
    }
}
