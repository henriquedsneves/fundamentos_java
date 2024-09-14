package fundamentos.Operadores;

public class Ternário {
	public static void main(String[] args) {
		double media = 8.5;
		String  resultadofinal = media >= 7 ? "aprovado" : "de recuperação";
		System.out.println("O aluno está:" + resultadofinal);
		
		double nota = 9;
		boolean bomComportamento = true;
		boolean passouPorMédia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMédia;
		String resultado = temDesconto ? "sim." : "Não.";
		System.out.printf("tem desconto? %s", resultado );
				
		
	}

}
