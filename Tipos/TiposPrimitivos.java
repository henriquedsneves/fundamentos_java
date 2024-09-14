package fundamentos.Tipos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// funcionários
		
		//numeros inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 98729;
		long pontosAcumulados = 3_989_999_999L;
		
		//numeros reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 9_999_999_999.22;
		
		//tipo boolean
		boolean estaDeFerias = true;
		
		//tipo caractare
		char status = 'A'; //ativo
		
		//dias da empresa
		System.out.println(anosDeEmpresa * 365 + " dias");
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2 +" viagens");
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas + " pontos por real");
		
		System.out.println(id + " ganha" + salario + " reais");
		System.out.println(id + " está de férias? " + estaDeFerias);
		System.out.println("status: " + status);
		
	}

}