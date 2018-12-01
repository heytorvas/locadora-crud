package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SQL {
    List<Cliente> cliente = new ArrayList<Cliente>();
    List<Funcionario> funcionario = new ArrayList<Funcionario>();
    List<Pessoa> pessoa = new ArrayList<Pessoa>();
    List<Filme> listaFilme = new ArrayList<Filme>();

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
        System.out.println("Informe o id do filme: ");
        filme.setIdFilme(sc.nextInt());
        sc.nextLine(); //gambiarra
        System.out.println("Informe o nome do filme: ");
        filme.setNomeFilme(sc.nextLine());
        System.out.println("Informe o genero do filme: ");
        System.out.println("\t(0) - Acao;");
        System.out.println("\t(1) - Animacao;");
        System.out.println("\t(2) - Comedia;");
        System.out.println("\t(3) - Drama;");
        System.out.println("\t(4) - Documentario;");
        System.out.println("\t(5) - Ficcao Cientifica;");
        System.out.println("\t(6) - Religiao;");
        System.out.println("\t(7) - Romance;");
        System.out.println("\t(8) - Suspense;");
        System.out.println("\t(9) - Terror;");
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
        System.out.println("Informe o diretor do filme: ");
        filme.setDiretorFilme(sc.nextLine());
        System.out.println("informe o ano de lancamento do filme: ");
        filme.setAnoLancamento(sc.nextInt());
        sc.nextLine(); //gambiarra
        System.out.println("Informe a duracao do filme: ");
        filme.setDuracaoFilme(sc.nextInt());
        sc.nextLine();
    }
    public static void consultarFilme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCOLHA O TIPO DE CONSULTA: ");
        System.out.println(" (1) - Listar todos os filmes cadastrados;");
        System.out.println(" (2) - Listar os filmes por ordem alfabetica;");
        System.out.println(" (3) - Listar os filmes pelo genero escolhido: ;");
        System.out.println(" (4) - Excluir filme;");
        System.out.println(" (5) - Sair;");
        int choice = sc.nextInt();
        sc.nextLine(); //gambiarra
        switch (choice){
            case 1:
                //imprimirLista(listafilme);
                break;
            case 2:
                //SQL.imprimirListaOrdenadaNomeFilme(listaFilme);
                break;
        }
    }
    /**
     * CONSULTAS DE FILMES
     **/
    public static void imprimirLista(List<Filme> lista)
    {
        lista.forEach(p -> System.out.println(p));
    }
    // Ordenando por Nomes dos Filmes
    public static void imprimirListaOrdenadaNomeFilme(List<Filme> lista) {
        lista.stream().sorted((filme1, filme2) -> filme1.getNomeFilme().compareTo(filme2.getNomeFilme()))
                .forEach(p -> p.imprimir());
    }

    // Imprimindo Filme pelo Genero desejado
    public static void imprimirListaGeneroFilme(List<Filme> lista, GeneroFilme generoFilme) {
        lista.stream().filter(p -> p.getGeneroFilme().equals(generoFilme)).forEach(p -> p.imprimir());
    }

    // Ordenando por Nomes dos Diretores
    public static void imprimirListaOrdenadaDiretores(List<Filme> lista) {
        lista.stream().sorted((filme1, filme2) -> filme1.getDiretorFilme().compareTo(filme2.getDiretorFilme()))
                .forEach(p -> p.imprimir());
    }

    // Imprimindo pelo ano de lancamento mais antigo
    public static void imprimirListaAnoLancamento(List<Filme> lista) {
        lista.sort((filme1, filme2) -> {
            Integer aux = filme1.getAnoLancamento();
            return aux.compareTo(filme2.getAnoLancamento());
        });
        lista.forEach(p -> p.imprimir());
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
            System.out.println("Usuário e/ou Senha incorretos");
            return null;
        }
    }
}