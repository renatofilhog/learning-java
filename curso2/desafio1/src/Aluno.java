public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    public void exibeFichaAluno() {
        String str = "Nome: "+this.nome + "\n";
        str += "Idade: " + this.idade;
        System.out.println(str);
    }

}
