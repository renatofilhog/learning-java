import java.util.Arrays;
public class ModeloCarro extends Carro {

    public ModeloCarro(String nomeModelo, double[] precosAno) {
        super(nomeModelo, precosAno);
    }

    public static void main(String[] args) {
        double[] precosFusca = {20000.0, 21000.0, 22000.0};
        ModeloCarro fusca = new ModeloCarro("Fusca", precosFusca);

        System.out.println("Modelo: " + fusca.getNomeModelo());
        System.out.println("Preços ao longo de três anos: " + Arrays.toString(fusca.getPrecosAno()));
        System.out.println("Menor preço: " + fusca.calcularMenorPreco());
        System.out.println("Maior preço: " + fusca.calcularMaiorPreco());
    }
}
