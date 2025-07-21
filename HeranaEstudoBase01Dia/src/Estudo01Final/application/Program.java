package Estudo01Final.application;

import Estudo01Final.entities.Funcionario;
import Estudo01Final.entities.FuncionarioCLT;
import Estudo01Final.entities.FuncionarioPJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Funcionario> funcionarioList = new ArrayList<>();

        System.out.println("Quantos funcionarios sao: ");
        int N = sc.nextInt();

        for (int i = 0; i <N ; i++) {
            System.out.println("Funcionario #" + (i + 1) + ": ");
            System.out.println("Funcionario e CLT ou PJ (c/p): ");
            char type = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Salario Base: ");
            double salarioBase = sc.nextDouble();

            if (type == 'c'){
                System.out.println("Beneficios: ");
                double beneficios = sc.nextDouble();

                funcionarioList.add(new FuncionarioCLT(beneficios,nome, salarioBase));

            }else {
                System.out.println("Projetos: ");
                double projetos = sc.nextDouble();

                funcionarioList.add(new FuncionarioPJ(projetos, nome, salarioBase));
            }
        }
        System.out.println("Lista funcionarios");
        for (Funcionario funcionario : funcionarioList){
            System.out.println(funcionario.getNome()+  "| Salario Base: $" + funcionario.getSalarioBase() +
                    "| Salario total: $" + funcionario.pagamento());
        }
    }
}
