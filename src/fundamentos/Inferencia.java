package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		// Nesse caso, posso deixar de declarar o tipo da variável
		// O java vai inferir pelo valor da variável, qual é o tipo da variável

		// Fazer inferência sobre; concluir, deduzir.
		// "i. uma hipótese sem verificar com rigor as premissas"

		// aqui eu informei o tipo
		double a = 4.5;
		System.out.println("Variável a: " + a);

		// aqui, já não informei o tipo
		var b = 4.5;
		System.out.println("Variável b: " + b);

		// se eu colocar inteiro, como iniciei com tipo double, ele vai transformar
		// inteiro para double
		b = 12;
		System.out.println("Variável b: " + b); // 12.0
		
	

		var c = "texto";
		System.out.println("Variável c: " + c);

		c = "outro texto";
		System.out.println("Variável c: " + c);

		// O Java NÃO aceita essa mudança de tipo!!
		// c = 4.5;

		var d = 12;
		System.out.println("Variável d: " + d);

		// iniciei como inteiro, Ele não aceita mudar o tipo double para inteiro
		// d = 12.4;

		double e; // Variável declarada
		e = 123.45; // Variável inicializada
		System.out.println("Variável e: " + e); // usada

		// NÃO consigo inicializar direto sem colocar o tipo e declarar a variável.

		// var f; // tentativa de inicializar a variável sem declara o tipo
		// f = 120.56;

		// Teria que fazer isso numa única linha
		var f = 120.456;
		System.out.println("Variável f: " + f);
	}

}
