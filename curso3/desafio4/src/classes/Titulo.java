package classes;

public class Titulo implements Comparable<Titulo> {
    private String titulo;

    public Titulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    @Override
    public int compareTo(Titulo other) {
        return titulo.compareTo(other.titulo);
    }
}
