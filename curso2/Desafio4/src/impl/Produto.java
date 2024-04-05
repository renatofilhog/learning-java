package impl;

import interf.Vendavel;

public class Produto implements Vendavel {
    @Override
    public double calculaPrecoTotal(double valor, double quantidade) {
        if (quantidade > 150) {
            valor = valor * quantidade;
            valor = valor - (valor * (0.5));
            return valor;
        }
        return valor * quantidade;
    }
}
