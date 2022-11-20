package modelo;

public class Empregado {
	private String nome;
	private String sobrenome;
	private String email;
	
	private boolean gerente;
	private boolean diretor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isGerente() {
		return gerente;
	}

	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}

	public boolean isDiretor() {
		return diretor;
	}

	public void setDiretor(boolean diretor) {
		this.diretor = diretor;
	}
	
	
}
