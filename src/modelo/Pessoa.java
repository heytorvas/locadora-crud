package modelo;

public class Pessoa {
	private String nome;
	private String cpf;
	private String email;
	private Cliente cliente;
	private Sexo sexo;

	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, String email, Cliente cliente, Sexo sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cliente = cliente;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", cliente=" + cliente + ", sexo=" + sexo
				+ "]";
	}

}
