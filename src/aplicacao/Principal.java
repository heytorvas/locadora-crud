package aplicacao;

import modelo.Cliente;
import modelo.Funcionario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 1 && opcao != 2) {
            System.out.println("escolha o tipo de usuario: 1- cliente 2- funcionario");
            opcao = sc.nextInt();
            sc.nextLine(); // gambiarra
            switch (opcao) {
                case 1:
                    c.menuClienteLogin();
                    break;
                case 2:
                    f.menuFuncionarioLogin();
                    break;
                default:
                    System.out.println("USER BURRO");
                    System.out.println();
            }
        }
    }
}
