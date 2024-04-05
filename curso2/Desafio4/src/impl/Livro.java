package impl;

import interf.Calculavel;

public class Livro implements Calculavel {

    @Override
    public double calcularPrecoFinal(double valor) {
        valor = valor - (valor * (this.taxa / 100));
        valor = valor - (valor * (this.desconto / 100));
        return valor;
    }
}
