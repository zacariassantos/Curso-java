package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionairo
		
		// type int number
		byte anosDeEmpresa = 23;
		short numeroDeVoos= 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// tipos numericos reais (ponto flutuante)
		
		float salario = 11_445.44F; // por padrão esse numero e double, mas a var é float, então devemos colocar F no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		char status = '\u0010'; //  para usar um simbolo da tabela unicode
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println(numeroDeVoos/2);
		// pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha->" + salario);
		
		System.out.println("Ferias? "+ estaDeFerias);
		
		System.out.println("Status:"+status);
	}
}