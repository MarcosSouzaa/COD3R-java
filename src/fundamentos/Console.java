package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		// Aqui não é pulado linha
		// A impressão será: Bom dia!
		System.out.print("Bom ");
		System.out.print("dia!");
		
		// Aqui pulo a linha com println, 
		// mas primeiro fica na primeira linha 
		System.out.println("Bom");
		
		// Aqui na sequência eu pulo a linha.
		System.out.println("dia!");
		
		// Usando concatenação com %d para valores inteiros
		// e  pulando linha com %n 
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		
		// Usando concatenação %s para variável
		// usando %.1f para ponto flutuante com uma casa decimal
		System.out.printf("Salário R$%.1f%n ", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();		
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		 
		System.out.printf("%s %s tem %d anos.%n",
				           nome, sobrenome, idade);
		
		// Fechar o programa
		entrada.close();
	} 
 
}
