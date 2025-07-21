package Estudo03Final.entities;

import Estudo02Final.entities.entities.Animal;

public class ProdutoNacional extends Produto {
    public ProdutoNacional(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double imposto() {
        return getPreco() * 0.25;
    }
}
