public class Musica {
    String titulo, artista;
    int anoLancamento;
    float avaliacao;
    int numAvaliacoes;
    float totalAvaliacao;

    public void exibeFichaTecnica() {
        String str = "Título: " + this.titulo + "\n";
        str+= "Artista " + this.artista + "\n";
        str+= "Ano de lançamento: " + this.anoLancamento + "\n";
        str+= "Avaliação: " + this.getMedia() + "\n";
        str+= "Número de Avaliações: " + this.numAvaliacoes;
        System.out.println(str);
    }

    public void avaliarMusica(float valorAvaliacao) {
        this.numAvaliacoes++;
        this.totalAvaliacao += valorAvaliacao;
    }
    public float getMedia() {
        return this.totalAvaliacao / (float) this.numAvaliacoes;
    }
}
