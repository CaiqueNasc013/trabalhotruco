package model;

public class Funcionario {

	private int id;
	
	private String nome;
	private String cargo;
	private String email;
	private String departamento;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	
	public Funcionario(String nome, String cargo, String email, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email; 
		this.departamento = departamento;
	}

	
	
}
