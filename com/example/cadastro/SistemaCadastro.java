package com.example.cadastro;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa Fernando = new Pessoa("Fernando Ocion", "123.456.789-10");
		
		//definimos o endereço de Fernando
		Fernando.setEndereco("RUA DA ABUNDANCIA");

		
		System.out.println("Nome:" + Fernando.getNome() + " - CPF:" + Fernando.getCpf() + " - Endereço:" + Fernando.getEndereco());
	}
}
