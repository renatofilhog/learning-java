public class Produto {
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(float valorDesconto) {
        this.preco = this.preco * (1 - valorDesconto/100);
    }

    public void exibeProduto(){
        String str = "Produto: " + this.getNome() + "\n";
        str += "Preço Original: R$ " + this.getPreco() + "\n";
        this.aplicarDesconto(20);
        str+= "Preço com desconto de 20%: R$ " + this.getPreco();
        System.out.println(str);
    }

}
