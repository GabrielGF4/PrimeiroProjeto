package br.com.bertini.primeiroprojeto;

public class Testelse {

	public static void main(String[] args) {
		
		int idade = 19;
		boolean amigoDoDono = false;
		
		if (idade > 18 && amigoDoDono) {
			System.out.println("entra");
		} else if(idade == 15){
			System.out.println("N�o pode entrar");
		} else {
			System.out.println("n�o entra");
			System.out.println("n�o entra");
		}
	
	}
}
