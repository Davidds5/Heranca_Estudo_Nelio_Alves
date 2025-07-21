package Estudo03Final.entities;

public class ProdutoImportado extends Produto{

    public ProdutoImportado(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double imposto() {
        return getPreco() * 0.10;
    }
}
