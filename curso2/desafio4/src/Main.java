import impl.*;

public class Main {
    public static void main(String[] args) {
        makeLine();
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println("10 reais em dolar: "+ conversorMoeda.converterDolarParaReal(10));
        makeLine();
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();
        System.out.println("O perimetro e área de uma sala retangular de base 32cm e altura de 55cm é respectivamente de: "
                + calculadoraSalaRetangular.calcularPerimetro(32,55) + "cm "
                + calculadoraSalaRetangular.calcularArea(32,55) + "cm"
        );
        makeLine();
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(7);
        makeLine();
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        double celsius = 20.0;
        double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C corresponde a " + fahrenheit + "°F");
        makeLine();
        double fahrenheit2 = 68.0;
        double celsius2 = conversor.fahrenheitParaCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + "°F corresponde a " + celsius2 + "°C");
        makeLine();
        ProdutoFisico produto = new ProdutoFisico();
        double valorBase = 100.0;
        System.out.println("Valor base do produto: R$ " + valorBase);
        System.out.println("Desconto aplicado (%): " + produto.desconto + "%");
        double precoFinal = produto.calcularPrecoFinal(valorBase);
        System.out.println("Preço final com desconto: R$ " + precoFinal);
        makeLine();
        Livro livro = new Livro();
        double valorLivro = 100.0;
        System.out.println("Valor base do livro: R$ " + valorLivro);
        System.out.println("Desconto aplicado (%): " + livro.desconto + "%");
        double precoLivro = livro.calcularPrecoFinal(valorLivro);
        System.out.println("Preço final com desconto: R$ " + precoLivro);
        makeLine();
        Produto produto2 = new Produto();
        double valorUnitario = 10.0;
        double quantidade = 200;
        double precoTotal = produto2.calculaPrecoTotal(valorUnitario, quantidade);
        System.out.println("Valor unitário do produto: R$ " + valorUnitario);
        System.out.println("Quantidade vendida: " + quantidade);
        System.out.println("Preço total com desconto (se aplicável): R$ " + precoTotal);
        makeLine();
        Servico servico = new Servico();
        valorUnitario = 100.0;
        quantidade = 5;
        precoTotal = servico.calculaPrecoTotal(valorUnitario, quantidade);
        System.out.println("Valor unitário do serviço: R$ " + valorUnitario);
        System.out.println("Quantidade contratada: " + quantidade + " horas");
        System.out.println("Preço total com desconto (se aplicável): R$ " + precoTotal);
        makeLine();
    }

    public static void makeLine() {
        System.out.println("{===}{===}{===}{===}{===}{===}{===}{===}{===}{===}{===}{===}{===}");
    }
}