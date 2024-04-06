public class ContaBancaria {
    public String titular;
    private String numeroConta;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibeConta() {
        String str = "Titular: " + this.titular + "\n";
        str += "Número da conta: " + this.getNumeroConta() + "\n";
        str += "Saldo da conta: R$ " + this.getSaldo();
        System.out.println(str);
    }
}