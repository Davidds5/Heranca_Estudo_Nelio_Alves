package ProjetoEstudo01.applications;

import ProjetoEstudo01.entites.Admistrador;
import ProjetoEstudo01.entites.Cliente;
import ProjetoEstudo01.entites.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuariosList = new ArrayList<>();

        int op;


        do {
            System.out.println("=== MENU DE ESCOLHA ===");
            System.out.println("1 - Cadrasta Usuario");
            System.out.println("2 - Lista Usuarios");
            System.out.println("3 - Busca Usuario por nome");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Quantos usuarios deseja cadrasta: ");
                    int N = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < N; i++) {
                        System.out.println("Usuario#" + (i + 1) + ": ");
                        System.out.print("Admistrador ou Cliente (A/C): ");
                        char type = sc.next().toLowerCase().charAt(0);
                        sc.nextLine();

                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        if (type == 'a') {
                            System.out.print("Setor: ");
                            String setor = sc.nextLine();

                            usuariosList.add(new Admistrador(nome, email, setor));

                        } else {
                            System.out.print("Pontos de fidelidade: ");
                            int pontos = sc.nextInt();

                            usuariosList.add(new Cliente(nome, email, pontos));
                            break;

                        }
                    }
                case 2:
                    System.out.println("Lista de usuarios");
                    for (Usuario usuario : usuariosList) {
                        System.out.println(usuario);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("=== Busca usuario por nome ===");
                    System.out.print("Informe o nome que deseja busca: ");
                    String nomeBusca = sc.nextLine();
                    boolean encotrado = false;

                    for (Usuario usuario : usuariosList) {
                        if (usuario.getNome().equalsIgnoreCase(nomeBusca)) {
                            encotrado = true;
                            System.out.println("Nome encotrado com sucesso!!");
                            System.out.print(usuario.getNome());
                        }
                    }
                    if (!encotrado) {
                        System.out.println("Nome nao encotrado.");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrando...");
                    break;
                default:
                    System.out.println("Numero invalido, tente novamente.");
            }

        } while (op != 0);


        sc.close();

    }
}



