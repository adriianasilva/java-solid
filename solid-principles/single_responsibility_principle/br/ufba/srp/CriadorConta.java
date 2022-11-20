package br.ufba.srp;

public class CriadorConta {
	public static void criar(Pessoa usuario) {
		System.out.println("Seu id de usu�rio � " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
	}

}
