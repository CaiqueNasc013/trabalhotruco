package Controller;

import java.util.ArrayList;
import java.util.List;
import model.Candidatura;
import model.Funcionario;
import model.Vaga;

public class GerenciadorRH {
	    private List<Funcionario> funcionarios;
	    private List<Vaga> vagas;
	    private List<Candidatura> candidaturas;
	    
	    //Adicionar Funcionario
	    
	    public void adicionarFuncionario(Funcionario funcionario) {
	        funcionarios.add(funcionario);
	    }
	    
	    public Funcionario buscarFuncionario(String cargo, String nome) {
	        for (Funcionario funcionario : funcionarios) {
	            if (funcionario.getCargo().equals(cargo) && funcionario.getNome().equals(nome)) {
	                return funcionario;
	            }
	        }
	        return null;
	    }
	    //adicionar Vaga
	    public void adicionarVaga(Vaga vaga) {
	        vagas.add(vaga);
	    }
	    
	    public Vaga buscarVaga(String descricao, String status) {
	        for (Vaga vaga : vagas) {
	            if (vaga.getDescricao().equals(descricao) && vaga.getStatus().equals(status)) {
	                return vaga;
	            }
	        }
	    
	        return null;
	    }
	    //Adicionar Candidatura 
	        public void adicionarCandidatura(Candidatura candidatura) {
		        candidaturas.add(candidatura);
		    }
		    
		    public Candidatura buscarCandidatura(String descricao, String status) {
		        for (Candidatura candidatura : candidatura) {
		            if (candidatura.getDescricao().equals(descricao) && candidatura.getStatus().equals(status)) {
		                return candidatura;
		            }
		        }
		        return null;    
	    

}
}

	    