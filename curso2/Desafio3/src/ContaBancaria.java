import java.util.Arrays;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

}

