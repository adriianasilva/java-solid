package br.ufba.srp;

public class ValidadorPessoa {
	
	public static boolean validar(Pessoa pessoa) {
		
		if (pessoa.getPrimeiroNome().isEmpty()) {
			System.out.println("Você não forneceu um primeiro nome válido");
			return false;
		}
		
		if (pessoa.getUltimoNome().isEmpty()) {
			System.out.println("Você não forneceu um último nome válido");
			return false;
		}
		
		return true;
	}

}
