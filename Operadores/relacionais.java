package fundamentos.Operadores;

public class relacionais {
	public static void main(String[] args) {
		int a = 3;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 >= 9);
		System.out.println(9 <= 11);
		System.out.println(7 != 9);
		
		double nota = 9;
		boolean bomComportamento = true;
		boolean passouPorMédia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMédia;
		System.out.println("tem desconto? " + temDesconto);
				
	}

}
