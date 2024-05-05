package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {

		// Acesso um espaço de memória com uma variável
		// Vou criar uma variável tipo double (ponto flutuante) para receber o RAIO
		// Vou criar uma variável tipo double (ponto flutuante) para receber o valor de
		// PI

		double raio = 3.4;
		final double PI = 3.14159; //Aqui eu transformei a variável pi em uma constante PI

        // Vou precisar da fórmula para calcular a circunferência
        // pi * raio * raio
		
		// System.out.println(pi * raio * raio);
		
		//Outra forma 
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		// Vou atribuir um novo valor ao raio
		// Vou concatenar o resultado
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m2");
	}
}
