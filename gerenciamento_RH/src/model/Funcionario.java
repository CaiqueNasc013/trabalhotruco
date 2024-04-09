package model;

public class Funcionario {

	private int id;
	private String nome;
	private String cargo;
	private String email;
	private String departamento;
	
	public Funcionario(String nome, String cargo, String email, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email; 
		this.departamento = departamento;
	}
	
	
}
