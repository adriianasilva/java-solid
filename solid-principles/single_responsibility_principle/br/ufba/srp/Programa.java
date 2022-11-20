package br.ufba.srp;


import java.io.IOException;


public class Programa {

	public static void main(String[] args) throws IOException {
		
		GerenciadorMensagens.mensagemBoasVindas();
		
		Pessoa usuario = CapturaDados.obterDados();
		
		if(ValidadorPessoa.validar(usuario) == false) {
			GerenciadorMensagens.mensagemFimPrograma();
			return;
		}
		
		CriadorConta.criar(usuario);
	
		GerenciadorMensagens.mensagemFimPrograma();
		
	}

}