package modelo;

import java.util.Scanner;

public class Cliente extends Pessoa implements Impressao
{

    private int idCliente;
    private Planos planos;
    private String username;
    private String password;
    Scanner leia = new Scanner(System.in);

    public Cliente(){}
    public Cliente(int idCliente, Planos planos, String username, String password) {
        this.idCliente = idCliente;
        this.planos = planos;
        this.username = username;
        this.password = password;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public Planos getPlanos() {
        return planos;
    }
    public void setPlanos(Planos planos) {
        this.planos = planos;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }
    public void menuClienteLogin(){
   
    }
    public Cliente cadastrarCliente(){
        Cliente c = new Cliente();

        return c;
    }

    @Override
    public String toString() {
        Pessoa p = new Pessoa();
        return "Cliente{" +
                p.toString() +
                "idCliente=" + idCliente +
                ", planos=" + planos +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

