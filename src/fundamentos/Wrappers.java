package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
// Wrapper (invólucro, embrulho) envolve o tipo primitivo tornado-o objeto.
// para o Wrapper vou começar com letra maiúscula
		
		// Para pegar o que o usuário digita
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100; // byte
		Short s = 1000; // short
		
		// Utilizando o Scanner
		System.out.println("Digite um valor numérico: ");
		
		// int - converte seu primeiro argumento para uma string, analisa, e retorna um inteiro ou NaN 
		Integer i = Integer.parseInt(entrada.next()); 
		System.out.println("Valor digitado multiplicado por 3 é igual a " + i*3 + "\n");
		Long l = 1000000L; //long
		
		System.out.println(b.byteValue());// mostra o valr 100
		System.out.println(s.toString());//transforma para String 1000
		System.out.println(l / 3.0); //333333.3333333333
		System.out.println(l / 3); //333333
		
		Float f = 123.10F;
		System.out.println(f);//123.1
		
		Double d = 1234.5678;
		System.out.println(d);//1234.5678
		
		// Transformar String em valor booleano
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);        
       
        // toString Transformar booleano para valor String
        // toUpercase retorna o valor da string original convertido em letras maiúsculas.
        System.out.println(bo.toString().toUpperCase());
        
        // usando o wrapper de cha que é Character 	
        Character c = '#';
        System.out.println(c + "Marcos");
		
		// encerra o scanner
		entrada.close();

	}
}
