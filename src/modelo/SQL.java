package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQL {
    List<Cliente> cliente = new ArrayList<Cliente>();
    List<Funcionario> funcionario = new ArrayList<Funcionario>();
    List<Pessoa> pessoa = new ArrayList<Pessoa>();
    static List<Filme> listaFilme = new ArrayList<Filme>();

    public void iniciar() {
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

    }
    public static void cadastrarFilme(){
        Filme filme = new Filme();
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O ID DO FILME: ");
        filme.setIdFilme(sc.nextInt());
        sc.nextLine(); //gambiarra
        System.out.println("INFORME O NOME DO FILME: ");
        filme.setNomeFilme(sc.nextLine());
        System.out.println("INFORME O GENERO DO FILME: ");
        System.out.println("\t(0) - ACAO;");
        System.out.println("\t(1) - ANIMACAO;");
        System.out.println("\t(2) - COMEDIA;");
        System.out.println("\t(3) - DRAMA;");
        System.out.println("\t(4) - DOCUMENTARIO;");
        System.out.println("\t(5) - FICCAO CIENTIFICA;");
        System.out.println("\t(6) - RELIGIAO;");
        System.out.println("\t(7) - ROMANCE;");
        System.out.println("\t(8) - SUSPENSE;");
        System.out.println("\t(9) - TERROR;");
        int escolha = sc.nextInt();
        sc.nextLine(); // gambiarra
        switch (escolha) {
            case 0:
                filme.setGeneroFilme(GeneroFilme.ACAO);
                break;
            case 1:
                filme.setGeneroFilme(GeneroFilme.ANIMACAO);
                break;
            case 2:
                filme.setGeneroFilme(GeneroFilme.COMEDIA);
                break;
            case 3:
                filme.setGeneroFilme(GeneroFilme.DRAMA);
                break;
            case 4:
                filme.setGeneroFilme(GeneroFilme.DOCUMENTARIO);
                break;
            case 5:
                filme.setGeneroFilme(GeneroFilme.FICCAO_CIENTIFICA);
                break;
            case 6:
                filme.setGeneroFilme(GeneroFilme.RELIGIAO);
                break;
            case 7:
                filme.setGeneroFilme(GeneroFilme.ROMANCE);
                break;
            case 8:
                filme.setGeneroFilme(GeneroFilme.SUSPENSE);
                break;
            case 9:
                filme.setGeneroFilme(GeneroFilme.TERROR);
                break;
            default:
                System.out.println("USER BURRO");
                break;
        }
        System.out.println("INFORME O DIRETOR DO FILME: ");
        filme.setDiretorFilme(sc.nextLine());
        System.out.println("INFORME O ANO DE LANCAMENTO DO FILME: ");
        filme.setAnoLancamento(sc.nextInt());
        sc.nextLine(); //gambiarra
        System.out.println("INFORME A DURACAO DO FILME: ");
        filme.setDuracaoFilme(sc.nextInt());
        sc.nextLine();
    }
    public static void consultarFilme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA O TIPO DE CONSULTA: ");
        System.out.println("\t(1) - LISTAR TODOS OS FILMES POR ID;");
        System.out.println("\t(2) - LISTAR OS FILMES POR ORDEM ALFABETICA;");
        System.out.println("\t(3) - LISTAR OS FILMES POR GENERO ESCOLHIDO;");
        System.out.println("\t(4) - LISTAR OS FILMES POR DIRETOR;");
        System.out.println("\t(5) - LISTAR OS FILMES POR ANO DE LANCAMENTO;");
        int choice = sc.nextInt();
        sc.nextLine(); //gambiarra
        switch (choice){
            case 1:
                imprimirLista(listaFilme);
                break;
            case 2:
                imprimirListaOrdenadaNomeFilme(listaFilme);
                break;
            case 3:
                imprimirListaGeneroFilme(listaFilme, GeneroFilme.ACAO);
                break;
            case 4:
            	imprimirListaOrdenadaDiretores(listaFilme);
            	break;
            case 5:
            	imprimirListaAnoLancamento(listaFilme);
        }
    }
    public void excluirFilme() {
    	
    }
    /**
     * CONSULTAS DE FILMES
     **/
    public static void imprimirLista(List<Filme> listaFilme)
    {
        listaFilme.forEach(p -> System.out.println(p));
    }
    // Ordenando por Nomes dos Filmes
    public static void imprimirListaOrdenadaNomeFilme(List<Filme> listaFilme) {
        listaFilme.stream().sorted((filme1, filme2) -> filme1.getNomeFilme().compareTo(filme2.getNomeFilme()))
                .forEach(p -> p.imprimir());
    }
    // Imprimindo Filme pelo Genero desejado
    public static void imprimirListaGeneroFilme(List<Filme> listaFilme, GeneroFilme generoFilme) {
        listaFilme.stream().filter(p -> p.getGeneroFilme().equals(generoFilme)).forEach(p -> p.imprimir());
    }
    // Ordenando por Nomes dos Diretores
    public static void imprimirListaOrdenadaDiretores(List<Filme> listaFilme) {
        listaFilme.stream().sorted((filme1, filme2) -> filme1.getDiretorFilme().compareTo(filme2.getDiretorFilme()))
                .forEach(p -> p.imprimir());
    }

    // Imprimindo pelo ano de lancamento mais antigo
    public static void imprimirListaAnoLancamento(List<Filme> listaFilme) {
        listaFilme.sort((filme1, filme2) -> {
            Integer aux = filme1.getAnoLancamento();
            return aux.compareTo(filme2.getAnoLancamento());
        });
        listaFilme.forEach(p -> p.imprimir());
    }

    public Pessoa login(String username, String password) {
        final Pessoa[] usuarioLogado = new Pessoa[1];
        pessoa.forEach(login -> {
            if (login.getUsername().equalsIgnoreCase(username) && login.getPassword().equals(password)) {
                usuarioLogado[0] = login;
            }
        });
        try {
            return usuarioLogado[0];
        } catch (Exception e) {
            System.out.println("USUARIO E/OU SENHA INCORRETOS");
            return null;
        }
    }
}