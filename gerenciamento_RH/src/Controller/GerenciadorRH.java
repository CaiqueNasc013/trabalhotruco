package Controller;

import java.util.ArrayList;
import java.util.List;
import View.InterfaceRH;
import model.Candidatura;
import model.Funcionario;
import model.Vagas;

public class GerenciadorRH {
	    private List<Funcionario> funcionarios;
	    private List<Vagas> vagas;
	    private List<Candidatura> candidaturas;

	    public GerenciadorRH() {
	        this.funcionarios = new ArrayList<>();
	        this.vagas = new ArrayList<>();
	        this.candidaturas = new ArrayList<>();
	    }

	  
	    public void adicionarFuncionario(Funcionario funcionario) {
	        funcionarios.add(funcionario);
	    }

	    @Override
	    public void atualizarFuncionario(){
	        for (int i = 0; i < funcionarios.size(); i++) {
	            if (funcionarios.get(i).getId() == funcionario.getId()) {
	                funcionarios.set(i, funcionario);
	                break;
	            }
	        }
	    }

	    @Override
	    public void removerFuncionario(Funcionario funcionario){
	        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
	    }

	    @Override
	    public void adicionarVagas1(Vagas vaga) {
	        vagas.add(vaga);
	    }

	    @Override
	    public void atualizarVaga(Vaga vaga) {
	        for (int i = 0; i < vagas.size(); i++) {
	            if (vagas.get(i).getId() == vaga.getId()) {
	                vagas.set(i, vaga);
	                break;
	            }
	        }
	    }

	    @Override
	    public void removerVaga(int id) {
	        vagas.removeIf(vaga -> vaga.getId() == id);
	    }

	    @Override
	    public void adicionarCandidatura(Candidatura candidatura) {
	        candidaturas.add(candidatura);
	    }

	    @Override
	    public void atualizarCandidatura(Candidatura candidatura) {
	        for (int i = 0; i < candidaturas.size(); i++) {
	            if (candidaturas.get(i).getId() == candidatura.getId()) {
	                candidaturas.set(i, candidatura);
	                break;
	            }
	        }
	    }

	    @Override
	    public void removerCandidatura(int id) {
	        candidaturas.removeIf(candidatura -> candidatura.getId() == id);
	    }

		@Override
		public void adicionarFuncionario(Funcionario funcionario) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void atualizarFuncionario(Funcionario funcionario) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void adicionarVagas(Vagas vaga) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void atualizarVagas(Vagas vaga) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removerVagas(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void adicionarCandidatura(Candidatura candidatura) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void atualizarCandidatura(Candidatura candidatura) {
			// TODO Auto-generated method stub
			
		}
	}

