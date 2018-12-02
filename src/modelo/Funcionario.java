package modelo;

import java.util.Scanner;

public class Funcionario extends Pessoa implements Interface {
    Scanner sc = new Scanner(System.in);
    private int idFuncionario;
    private double salarioFuncionario;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String email, Sexo sexo, int idFuncionario,
                       double salarioFuncionario, String username, String password) {
        super(nome, cpf, email, sexo, username, password);
        this.idFuncionario = idFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    @Override
    public void imprimir() {

    }

    @Override
    public void menu() {
    }
}
