package impl;
import interf.*;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double largura, double altura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double largura, double altura) {
        return largura*2 + altura+2;
    }
}
