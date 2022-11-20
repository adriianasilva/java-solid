package modelo.candidato;

import modelo.contas.CriadorContasDiretor;
import modelo.contas.ICriadorContas;

public class CandidatoDiretor implements ICandidato {

	public String nome;
	public String sobrenome;
	
	public CandidatoDiretor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public ICriadorContas obterCriadorContas() {
		return new CriadorContasDiretor();
	}
	

}
