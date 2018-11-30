package aplicacao;

import modelo.Cliente;
import modelo.Filme;
import modelo.GeneroFilme;
import modelo.Pessoa;
import modelo.Planos;
import modelo.Sexo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		List<Pessoa> lista = new ArrayList<Pessoa>();

		Cliente c1 = new Cliente(1, Planos.BASICO, "cliente1", "senha1");
		Cliente c2 = new Cliente(2, Planos.PLUS, "cliente2", "senha2");
		Cliente c3 = new Cliente(3, Planos.VIP, "cliente2", "senha2");

		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		System.out.println(lista);

		List<Filme> listaFilme = new ArrayList<Filme>();

		Filme f1 = new Filme(1, "Jurassic Park", GeneroFilme.FICCAO_CIENTIFICA, "Steven Spielberg", 1998, 120);
		Filme f2 = new Filme(2, "A Cabana", GeneroFilme.RELIGIAO, "William P. Young ", 2017, 160);
		Filme f3 = new Filme(3, "Vingadores", GeneroFilme.ACAO, "Stan Lee", 2018, 180);
		Filme f4 = new Filme(4, "IT: A Coisa", GeneroFilme.TERROR, "Stephen King", 2017, 180);
		Filme f5 = new Filme(5, "Jurassic Park 2", GeneroFilme.FICCAO_CIENTIFICA, "Steven Spielberg", 2000, 180);

		listaFilme.add(f1);
		listaFilme.add(f2);
		listaFilme.add(f3);
		listaFilme.add(f4);
		listaFilme.add(f5);

		Principal.imprimirListaGeneroFilme(listaFilme, GeneroFilme.FICCAO_CIENTIFICA);
		Principal.imprimirListaAnoLancamento(listaFilme);

		// System.out.println(" \nEntre com seu login abaixo\n");
		// c.menuClienteLogin();

	}

	public void menuLocacao() {
		System.out.println("===== BEM VINDO A LOCADORA LABAXURIAS =====\n");
		System.out.println("Escolha o tipo de filme");

	}

	/** CONSULTAS DE FILMES **/
	// Ordenando por Nomes dos Filmes
	public static void imprimirListaOrdenadaNomeFilme(List<Filme> listaFilme) {
		listaFilme.stream().sorted((filme1, filme2) -> filme1.getNomeFilme().compareTo(filme2.getNomeFilme()))
				.forEach(p -> p.imprimir());
	}

	// Imprimindo Filme pelo Gênero desejado
	public static void imprimirListaGeneroFilme(List<Filme> listaFilme, GeneroFilme generoFilme) {
		listaFilme.stream().filter(p -> p.getGeneroFilme().equals(generoFilme)).forEach(p -> p.imprimir());
	}

	// Ordenando por Nomes dos Diretores
	public static void imprimirListaOrdenadaDiretores(List<Filme> listaFilme) {
		listaFilme.stream().sorted((filme1, filme2) -> filme1.getDiretorFilme().compareTo(filme2.getDiretorFilme()))
				.forEach(p -> p.imprimir());
	}

	// Imprimindo pelo ano de lançamento mais antigo
	public static void imprimirListaAnoLancamento(List<Filme> listaFilme) {
		listaFilme.sort((filme1, filme2) -> {
			Integer aux = filme1.getAnoLancamento();
			return aux.compareTo(filme2.getAnoLancamento());
		});
		listaFilme.forEach(p -> p.imprimir());
	}
}
