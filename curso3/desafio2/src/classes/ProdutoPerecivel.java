package classes;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    public String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome,preco,quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " ==> ProdutoPerecivel{" +
                "dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
