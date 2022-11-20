package br.ufba.srp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CapturaDados {

	public static Pessoa obterDados() throws IOException {
		Pessoa pessoa = new Pessoa();
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Qual é seu primeiro nome?");
		pessoa.setPrimeiroNome(teclado.readLine());
		
		System.out.println("Qual é seu último nome?");
		pessoa.setUltimoNome(teclado.readLine());
		
		return pessoa;
	}
}
