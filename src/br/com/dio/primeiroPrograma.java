package br.com.dio;

import br.com.dio.model.gato;

public class primeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! "+ (a+b));*/
		
		gato Gato = new gato ();
		Livros livros = new Livros();
		
		System.out.println(Gato);
		System.out.println(livros);
	} 

}

class Livros {
	private String nome;
	private String npag;
}
