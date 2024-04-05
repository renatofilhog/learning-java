package impl;
import interf.*;
public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.05;
    }
}
