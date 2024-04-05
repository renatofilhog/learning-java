public class IdadePessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {
        if (this.getIdade() >18) {
            return "Maior de idade";
        }
        return "Menor de idade";
    }

    public void exibeIdadePessoa() {
        String str = "Nome: " + this.getNome() + "\n";
        str += "Idade: " + this.getIdade() + " anos \n";
        str += this.getNome() + " é " + this.verificarIdade();
        System.out.println(str);
    }

}
