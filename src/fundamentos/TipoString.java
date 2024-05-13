package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(0) + " Letra no índice 0.");
		// O Letra no índice 0.
		System.out.println("Olá pessoal!".charAt(1) + " Letra no índice 1");
		// l Letra no índice 1
		System.out.println("Olá pessoal!".charAt(2) + " Letra no índice 2.");
		// á Letra no índice 2.
		System.out.println("Olá pessoal!".charAt(3) + " Letra no índice 3.");
		// espaço - Letra no índice 3.
		System.out.println("Olá pessoal!".charAt(4) + " Letra no índice 4.");
		// p Letra no índice 4.
		System.out.println("Olá pessoal!".charAt(5) + " Letra no índice 5.");
		// e Letra no índice 5.
		System.out.println("Olá pessoal!".charAt(6) + " Letra no índice 6.");
		// s Letra no índice 6.
		System.out.println("Olá pessoal!".charAt(7) + " Letra no índice 7.");
		// s Letra no índice 7.
		System.out.println("Olá pessoal!".charAt(8) + " Letra no índice 8.");
		// o Letra no índice 8.
		System.out.println("Olá pessoal!".charAt(9) + " Letra no índice 9.");
		// a Letra no índice 9.
		System.out.println("Olá pessoal!".charAt(10) +" Letra no índice 10.");
		// l Letra no índice 10.
		System.out.println("Olá pessoal!".charAt(11)+ " Letra no índice 11.");
		// ! Letra no índice 11.		 
		
		//Funcionalidades da String:
		String s = "Boa Tarde";
		//s = s.toUpperCase(); // Passando para maiúsculo
		System.out.println("\n" + s);
		
		// Formas de concatenar
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		// A String 'Boa" inicia com... letra maiúscula ou minúscula?
		System.out.println(s.startsWith("Boa")); //true
		System.out.println(s.startsWith("boa")); //false
		
		// A String 'Boa" inicia com... letra minúscula?
		// .toLowerCase para  consider INÍCIO minúscula
		System.out.println(s.toLowerCase().startsWith("boa")); //true
		System.out.println(s.toLowerCase().startsWith("Boa")); //

		//A String original termina com Tarde?		
		System.out.println("Termina com Tarde? " + s.endsWith("Tarde"));// true
		
		//A String original após a conversão termina com Tarde?	
		System.out.println("Termina com Tarde? " + s.toUpperCase().endsWith("TARDE"));// true
		
		//Quantos caracteres tem uma String?
		System.out.println("quantidade de caracteres na String s: " + s.length());
		
		// Testando a igualdade 
		System.out.println(s.equals("boa tarde"));// false
		
		// Ignorando se é maiúscula ou minúscula
		System.out.println(s.equalsIgnoreCase("boa tarde"));// true
		
		// Podemos criar variáveis com var e o java vai fazer a inferência do tipo
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 121345.97;
		
		// primeira forma de cooncatenação:
		System.out.println("\nNome: " + nome+ "\nSobrenome: "
		                  +sobrenome + "\nIdade: " + idade +
		                  "\nSalário: R$" + salario);
		/*
	    Retorna assim:
		Nome: Pedro
		Sobrenome: Santos
		Idade: 33
		Salário: R$121345.97
		*/
		
		//Poderia também criar uma variável para pegar toda concatenação
		String maisUmaFrase = "\nNome: " + nome+ "\nSobrenome: "
                               +sobrenome + "\nIdade: " + idade +
                              "\nSalário: R$" + salario + "\n";
		System.out.println(maisUmaFrase);
		// retorna o mesmo de cima.
		
		// Posso substituir por System.out.printf e usar formatação
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				          nome, sobrenome, idade, salario);
		//O senhor Pedro Santos tem 33 anos e ganha R$121345,97.
		 
		/* Posso ainda, criar uma String frase, usar o método String.format
		   Para alcançar o mesmo resultado*/
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
		          nome, sobrenome, idade, salario);
		System.out.println(frase + "\n");
		//O senhor Pedro Santos tem 33 anos e ganha R$121345,97.
		
		//uso de contains. Na Frase qualquer existe "qual" ?
		
		System.out.println("Frase qualquer".contains("qual")); //true		
		
		//começando com zero, o index é 6
		System.out.println("Frase qualquer".indexOf("qual"));
		
		// a contagem começa a partir do index 6
		System.out.println("Frase qualquer".substring(6));
		
		// Passando dois parâmetros, ele não umprime o caracter 8		
		System.out.println("Frase qualquer".substring(6, 8));// qu 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}




















