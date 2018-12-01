package aplicacao;

import modelo.*;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========BEM-VINDO A LOCADORA LABAXURIAS SIRICANTAS========");
		System.out.println("INFORME SEU USUARIO: ");
		String username = sc.nextLine();
		System.out.println("INFORME SUA SENHA: ");
		String password = sc.nextLine();

		SQL sql = new SQL();
		sql.iniciar();
		Pessoa usuario = sql.login(username, password);
		usuario.menu();
	}
}
