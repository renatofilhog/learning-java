public class Main {
    public static void main(String[] args) {
        makeLine();
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Renato Filho";
        contaBancaria.setNumeroConta("214521");
        contaBancaria.setSaldo(2000);
        contaBancaria.exibeConta();
        makeLine();
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("João Selim");
        idadePessoa.setIdade(30);
        idadePessoa.exibeIdadePessoa();
        makeLine();
        Produto produto = new Produto();
        produto.setNome("Acer Aspire 5");
        produto.setPreco(2700);
        produto.exibeProduto();
        makeLine();
        Aluno aluno = new Aluno();
        aluno.setNome("John Wick");
        aluno.setNotas(10,9,4,6);
        aluno.exibeAluno();
        makeLine();
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter: A pedra filosofal.");
        livro.setAutor("J. K. Rollwing");
        livro.exibirDetalhes();
        makeLine();
    }

    public static void makeLine() {
        System.out.println("|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|=+|");
    }
}