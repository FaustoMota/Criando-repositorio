package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Felix", "branco", 5);
	    Livros livro = new Livros();
		System.out.println(gato);
		System.out.println(livro);
	
	}

}

class Livros{
	private String nome;
	private String npag;
}