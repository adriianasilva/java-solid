package modelo.contas;

import modelo.Empregado;
import modelo.candidato.ICandidato;

public interface ICriadorContas {
	public Empregado criar(ICandidato candidato);
	
}
