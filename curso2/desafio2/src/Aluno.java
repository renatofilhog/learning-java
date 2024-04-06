public class Aluno {
    private String nome;
    private float nota1, nota2, nota3, nota4, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota4() {
        return nota4;
    }

    public void setNota4(float nota4) {
        this.nota4 = nota4;
    }

    public float getMedia() {
        return (this.getNota1()+this.getNota2()+this.getNota3()+this.getNota4())/4;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public void setNotas(float n1, float n2, float n3, float n4){
        this.setNota1(n1);
        this.setNota2(n2);
        this.setNota3(n3);
        this.setNota4(n4);
    }

    public void exibeAluno() {
        String str = "Nome: " + this.getNome() + "\n";
        str += "Média: " + this.getMedia();

        System.out.println(str);
    }
}
