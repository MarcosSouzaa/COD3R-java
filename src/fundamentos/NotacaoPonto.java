package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		// usando o ponto após a variável, terei acesso aos métodos
		// toUpperCase() para colocar em maiúscula
		String s = "Bom dia x";
		s = s.toUpperCase();
		System.out.println(s); // BOM DIA X

		// substituindo a letra com o método replace();
		String a = "bom dia";
		a = a.replace("x", "Senhora");
        a = a.toUpperCase();
		System.out.println(a);// BOM DIA SENHORA
		
		// Utilizando a função Concat para concatenar
		String b = "bom dia x";
		b = b.replace("x", "Senhora");
        b = b.toUpperCase();
        b = b.concat("!!!");
		System.out.println(b);// BOM DIA SENHORA!!!
		
		// posso fazer uso direto da função 
		System.out.println("Leo".toUpperCase());
		
		String c = "Leo".toUpperCase();
		System.out.println(c);
		
		/*
		Um outro caso:
		posso quebrar a linha antes ou depois do ponto
		posso incluir novos métodos como  etc.
		enquanto o resultado for String, posso ir colocando
		métodos ou função.
		 */
		String d = "Bom dia x"
				.replace("x" , "Marcos")
				.toUpperCase()
				.concat("!!!");	 
        System.out.println(d);
        
        //" TIPOS PRIMITIVOS NÃO TEM O OPERADOR "." (PONTO)!!"
        
        int e = 3;
        e.
	}

}
