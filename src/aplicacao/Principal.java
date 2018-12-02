package aplicacao;

import modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<Cliente>();
        List<Funcionario> funcionario = new ArrayList<Funcionario>();
        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        List<Filme> listaFilme = new ArrayList<Filme>();
        Cliente cliente1 = new Cliente(
                "adebaldo", "123", "adebaldo@uol.com", Sexo.MASCULINO, 1,
                Planos.BASICO, "adebayor", "corno");
        Cliente cliente2 = new Cliente(
                "francysgleydson", "234", "francys@outlook.com", Sexo.FEMININO,
                2, Planos.VIP, "deadpool", "xmen");
        Cliente cliente3 = new Cliente(
                "lazara", "345", "lazara@baidu.com", Sexo.FEMININO, 3,
                Planos.PLUS, "lazarada", "lasortuda");
        Funcionario funcionario1 = new Funcionario(
                "peter parkerson", "012", "eunaosouhomemaranha@gmail.com", Sexo.MASCULINO,
                1, 50.00, "aranhahumana", "octopus");
        Funcionario funcionario2 = new Funcionario(
                "garibalda", "987", "garfield@bol.com", Sexo.FEMININO, 2,
                60.00, "chrischris", "jamesbrown");
        Funcionario funcionario3 = new Funcionario(
                "charlie down jr", "666", "morreu@defunto.com", Sexo.FEMININO, 3,
                0.00, "cocaina", "skate");
        Filme f1 = new Filme
                (1, "Jurassic Park", GeneroFilme.FICCAO_CIENTIFICA,
                        "Steven Spielberg", 1998, 120
                );
        Filme f2 = new Filme
                (2, "A Cabana", GeneroFilme.RELIGIAO,
                        "William P. Young", 2017, 160);
        Filme f3 = new Filme
                (3, "Vingadores", GeneroFilme.ACAO,
                        "Stan Lee", 2018, 180);
        Filme f4 = new Filme
                (4, "IT: A Coisa", GeneroFilme.TERROR,
                        "Stephen King", 2017, 180);
        Filme f5 = new Filme
                (5, "Jurassic Park 2", GeneroFilme.FICCAO_CIENTIFICA,
                        "Steven Spielberg", 2000, 180);
        listaFilme.add(f1);
        listaFilme.add(f2);
        listaFilme.add(f3);
        listaFilme.add(f4);
        listaFilme.add(f5);
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        funcionario.add(funcionario1);
        funcionario.add(funcionario2);
        funcionario.add(funcionario3);
        pessoa.add(cliente1);
        pessoa.add(cliente2);
        pessoa.add(cliente3);
        pessoa.add(funcionario1);
        pessoa.add(funcionario2);
        pessoa.add(funcionario3);

        Scanner sc = new Scanner(System.in);
        System.out.println("========BEM-VINDO A LOCADORA LABAXURIAS SIRICANTAS========");
        System.out.println("INFORME SEU USUARIO: ");
        String username = sc.nextLine();
        System.out.println("INFORME SUA SENHA: ");
        String password = sc.nextLine();

        //MENU FUNCIONARIO
        System.out.println("\n===== LOCADORA LABAXURIAS SIRICANTAS =====");
        System.out.println("=========== MENU FUNCIONARIO ==========");
        System.out.println(" (1) - CADASTRAR FILME;");
        System.out.println(" (2) - EDITAR FILME;");
        System.out.println(" (3) - CONSULTAR FILME;");
        System.out.println(" (4) - EXCLUIR FILME;");
        System.out.println(" (5) - SAIR;");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                listaFilme.add(Filme.cadastrarFilme());
                Filme.imprimirLista(listaFilme);
                break;
            case 2:
                break;
            case 3:
                Filme.consultarFilme(listaFilme);
                break;
            case 5:
                break;
            default:
                break;
        }
    }
//		SQL sql = new SQL();
//		Pessoa usuario = sql.login(username, password, pessoa);
//		usuario.menu();
}
