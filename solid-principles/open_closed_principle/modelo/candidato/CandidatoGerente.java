package modelo.candidato;

import modelo.contas.CriadaorContasGerente;
import modelo.contas.ICriadorContas;

public class CandidatoGerente implements ICandidato {

	private String nome;
	private String sobrenome;
	
	@Override
	public String getNome() {
		return nome;
	}

	public CandidatoGerente(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public ICriadorContas obterCriadorContas() {
		return new CriadaorContasGerente();
	}

}
