public class Livro {
    private String titulo, autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        String str = "Título: " + this.titulo + "\n";
        str += "Autor: " + this.autor;
        System.out.println(str);
    }
}
