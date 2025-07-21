package Estudo03Final.application;


import Estudo03Final.entities.Produto;
import Estudo03Final.entities.ProdutoImportado;
import Estudo03Final.entities.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtoList = new ArrayList<>();

        System.out.println("Quantos produtos deseja cadrasta: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Produto#" + (i + 1) + " dados: ");
            System.out.println("Nacional ou Importado (N/I): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preco: ");
            double preco = sc.nextDouble();

            if (type == 'n') {
                produtoList.add(new ProdutoNacional(nome, preco));

                for (Produto produto : produtoList) {
                    System.out.println(produto.getNome());
                }

            } else {
                produtoList.add(new ProdutoImportado(nome, preco));
                for (Produto produto : produtoList) {
                    System.out.println(produto.getNome());
                }
            }
        }
    }
}

