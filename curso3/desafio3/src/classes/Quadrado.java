package classes;

import classes.interf.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado() {

    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
