package impl;

import interf.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double valor) {
        return (1.8 * valor) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double valor) {
        return ((double) 5 /9) * (valor - 32);
    }
}
