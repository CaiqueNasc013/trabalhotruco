package View;

import model.Candidatura;
import model.Funcionario;
import model.Vagas;


public interface InterfaceRH {
	void adicionarFuncionario(Funcionario funcionario);
	void atualizarFuncionario(Funcionario funcionario);
	void removerFuncionario(Funcionario funcionario);

	void adicionarVagas(Vagas vaga);
	void atualizarVagas(Vagas vaga);
	void removerVagas(int id);
	
	void adicionarCandidatura(Candidatura candidatura);
	void atualizarCandidatura(Candidatura candidatura);
	void removerCandidatura(int id);
	


}
