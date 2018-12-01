package modelo;

public class Cliente extends Pessoa implements Interface {
    private int idCliente;
    private Planos planos;

    public Cliente() {
    }
    public Cliente(String nome, String cpf, String email, Sexo sexo, int idCliente, Planos planos, String username, String password) {
        super(nome, cpf, email, sexo, username, password);
        this.idCliente = idCliente;
        this.planos = planos;
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

    @Override
    public void imprimir() {

    }

    @Override
    public void menu() {
        System.out.println("\n===== LOCADORA LABAXURIAS SIRICANTAS =====");
        System.out.println("=========== MENU CLIENTE ==========");
        SQL.consultarFilme();
    }


}

