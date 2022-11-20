package modelo.candidato;

import modelo.contas.ICriadorContas;

public interface ICandidato {
	public String getNome();
	public String getSobrenome();
	
	public ICriadorContas obterCriadorContas();
}
