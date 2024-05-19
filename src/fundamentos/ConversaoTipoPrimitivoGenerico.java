package fundamentos;

public class ConversaoTipoPrimitivoGenerico {

	public static void main(String[] args) {
		/*
		 * Aqui tenho uma conversão implícita de um inteiro para um de ponto flutuante
		 * (double que é maior). conversão implícita
		 */
		double a = 1;
		System.out.println(a); // 1.0

		/*
		 * Converter um valor double em float Nesse caso, tenho que colocar o F de float
		 * ou fazer o cast deixando explicito para o Java que estou ciente que perderei
		 * dados. aqui haverá erro: float b = 1.0;
		 */

		/*
		 * uma das formas de deixar explícito para o java, COLOCANDO f: Nesse caso, não
		 * haverá perdas porque float suporta a qt de dados desse double.
		 * Conversão explícita
		 */
		float b = 1.12345F;
		System.out.println(b);// 1.12345

		// Nesse caso, mesmo colocando F, haverá perda
		float c = 1.123456788888889F;// 1.1234568
		System.out.println(c);
		
		// Utilizando o CAST
		// Há conversão com perda
		float d = (float)1.234567888888889;
		System.out.println(d); //1.2345679
		
		// Java analisa o tipo e int é maior que byte
		// Tenho que fazer o CAST
		int e = 4;
		byte f = (byte) e;
		System.out.println(f);// 4
		
		// O valor máx de conversão é 127
		// maior que isto dará erro.
		int g = 128;
		byte h = (byte)g;
		System.out.println(h);// -128
		
		// double é maior que int, tenho que fazer a conversão explícita
		// mesmo haverá perda
		double i = 1.99999;
		int j = (int)i;
		System.out.println(j); // 1
		
		/*  EVITAR AO MÁXIMO USAR byte  */

	}

}
