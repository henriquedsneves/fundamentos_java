package fundamentos.Operadores;

public class Unários {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		--a; // a = a - 1
		b--; // b = b - 1
		++b; // b = b + 1
		
		System.out.println(++a == b--); // com o positivo na frente do a 
		//ele vai ser lido antes da comparação, já o b só vai ser lido após 
		// a comparação tenha sido finalizada, porcausa do negativo na sua direita. 
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
	}

}
