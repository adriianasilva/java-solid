package modelo.contas;

import modelo.Empregado;
import modelo.candidato.ICandidato;

public class CriadaorContasGerente implements ICriadorContas{

	@Override
	public Empregado criar(ICandidato candidato) {

        Empregado empregado = new Empregado();

        empregado.setNome(candidato.getNome());
        empregado.setSobrenome(candidato.getSobrenome());
        empregado.setEmail(candidato.getNome() + candidato.getSobrenome() + "@xpto.com");
        
        empregado.setGerente(true);
        
        return empregado;
	}
	

}
