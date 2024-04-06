package impl;

import interf.Calculavel;

public class ProdutoFisico implements Calculavel {
    public double desconto = 20;

    @Override
    public double calcularPrecoFinal(double valor) {
        valor = valor - (valor * (this.taxa / 100));
        valor = valor - (valor * (this.desconto / 100));
        return valor;
    }
}
