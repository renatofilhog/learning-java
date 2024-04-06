public class ContaBancaria {
    private String nomeTitular;
    private String numeroConta;
    private int tipoConta = 0;

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        if (this.tipoConta == 0) {
            if (tipoConta == 1) {
                this.tipoConta = tipoConta;
                this.saldo = 1500;
            } else if (tipoConta == 2) {
                this.tipoConta = tipoConta;
                this.saldo = 2000;
            } else {
                System.out.println("Tipo de conta incorreto");
            }
        }
    }

    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void recebeTransferencia(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    public void fazTransferencia(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.getSaldo() - valor;
            System.out.println("Realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void recebePix(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    public void fazPix(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.getSaldo() - valor;
            System.out.println("Realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        String str = "Nome do Titular: " + this.nomeTitular;
        str += "\n";
        str += "Número da conta: " + this.numeroConta;
        str += "\n";
        str += "Tipo de conta: " + this.tipoConta;
        str += "\n";
        str += "Saldo conta: R$ " + this.saldo;

        return str;
    }
}
