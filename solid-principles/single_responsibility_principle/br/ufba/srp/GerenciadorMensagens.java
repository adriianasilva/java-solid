package br.ufba.srp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GerenciadorMensagens {
	
	public static void mensagemBoasVindas() {
		 System.out.println("Seja bem-vinda ou bem-vindo.");
	}
 
 	public static void mensagemFimPrograma() throws IOException {
	 
		 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Tecle enter para sair do programa...");
		 teclado.readLine();
 	}
}
