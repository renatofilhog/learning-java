package impl;

import interf.Vendavel;

public class Servico implements Vendavel {
    final double desconto = 15;
    @Override
    public double calculaPrecoTotal(double valor, double quantidade) {
        valor = valor * quantidade;
        valor = valor - (valor * (this.desconto / 100));
        return valor;
    }
}
