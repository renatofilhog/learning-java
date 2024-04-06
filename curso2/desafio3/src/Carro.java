import java.util.Arrays;

public class Carro {
    private String nomeModelo;
    private double[] precosAno;

    public Carro(String nomeModelo, double[] precosAno) {
        this.nomeModelo = nomeModelo;
        this.precosAno = precosAno;
    }

    public double calcularMenorPreco() {
        return Arrays.stream(precosAno).min().orElse(0.0);
    }

    public double calcularMaiorPreco() {
        return Arrays.stream(precosAno).max().orElse(0.0);
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double[] getPrecosAno() {
        return precosAno;
    }

    public void setPrecosAno(double[] precosAno) {
        this.precosAno = precosAno;
    }
}

