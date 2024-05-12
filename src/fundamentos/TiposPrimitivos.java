package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {

		// Informações do Funcionário

		// TIPOS NUMÉRICOS INTEIROS
		// Começando com o menor byte:
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;

		/*
		 * O Tipo long, quando uso um literal, posso usar _ underline para separar as
		 * casas de milhares (mil, milhão etc) se não ultrapassar o range, o java faz a
		 * conversão implicita para inteiro. Se ultrapassar o range, tenho que colocar a
		 * letra L.
		 */

		// Aqui ele é convertido para inteiro
		long pontosAcumulados = 2_134_845_223;
		// Aqui, temos que dizer que é um long colocando L.
		pontosAcumulados = 3_134_845_223L;

		// TIPOS LITERAIS REAL (com ponto flutuante)

		/*
		 * Qualquer tipo com ponto flutuante é do tipo DOUBLE, que é o dobro de float o
		 * que significa que não vou conseguir colocar double dentro de float. float
		 * salario = 11_445.44; Nesse caso vai dar erro. Mas se eu quiser que esse valor
		 * seja um float, preciso colocar a letra F.
		 */
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// TIPO BOOLEANO
		// Em java 0 ou 1 não define false ou true
		boolean estaDeFerias = false;
		estaDeFerias = true;

		// TIPO CARACTERE
		// Só aceita um único caractere
		char status = 'A'; // Ativo

		// Posso colocar caracteres da tabela unicode para representar um símbolo
		char tabelaUnicode = '\u03A3';

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

		// Número de viagens
		System.out.println("Número de viagens: " + numeroDeVoos / 2);

		// Pontos por real
		System.out.println("Pontos acumulados: " + pontosAcumulados / vendasAcumuladas);

		// Id
		System.out.println("Matrícula " + id + ": ganha -> R$" + salario);

		// Férias
		System.out.println("Férias? " + estaDeFerias);

		// Status
		System.out.println("Status do funcionário: " + status);

		// Unicode
		System.out.println("Símbolo Sigma: " + tabelaUnicode);

	}

}
