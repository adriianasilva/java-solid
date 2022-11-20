package modelo.candidato;

import modelo.contas.CriadorContasGenerico;
import modelo.contas.ICriadorContas;

public class CandidatoGenerico implements ICandidato {

	private String nome;
	private String sobrenome;
	private String email;
	
	
	public CandidatoGenerico(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public ICriadorContas obterCriadorContas() {
		return new CriadorContasGenerico();
	}

}

