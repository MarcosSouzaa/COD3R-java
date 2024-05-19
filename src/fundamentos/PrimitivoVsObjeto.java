package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		/*
		 * JAVA É CENTRADA EM CLASSE
		   Assim é a forma comumente usada, cria-se um tipo primitivo nesse caso, uma
		   variável "s" do tipo String que é uma classe e associado a essa classe, temos
	   o objeto s com o valor "texto".		   
		 */
		String s = "Texto";		
		// Esse objeto "s" quando usado uma notação '.' ponto, pode receber
		// atributos e métodos ex:
		s.toUpperCase();		
	
		// Da mesma forma, eu posso criar o objeto de outra forma menos usual
		String b = new String ("Texto");
        b.toUpperCase();
        
        /* EM JAVA, VOCÊ TEM O TIPO PRIMITIVO DE UM LADO E DO OUTRO, OBJETOS.
           Um tipo primitivo só carrega um valor consigo, NÃO consiguimos usar
           a notação '.'.        
             int a = 1234;
              a.
        */
        
       //	WRAPPERS (Invólucro) É a versão Objetos dos tipos primitivos
	}
	
}
