package modelo;

public class Funcionario extends Pessoa implements Impressao
{
    private int idFuncionario;
    private double salarioFuncionario;
    private String username;
    private String password;

    public Funcionario(){

    }

    public Funcionario(int idFuncionario, double salarioFuncionario, String username, String password) {
        this.idFuncionario = idFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.username = username;
        this.password = password;
    }

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
    public String toString() {
        Pessoa p = new Pessoa();
        return "Funcionario{" +
                p.toString() +
                "idFuncionario=" + idFuncionario +
                ", salarioFuncionario=" + salarioFuncionario +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this.toString());
    }
    public void menuFuncionarioLogin(){
        System.out.println("func");
    }
}
