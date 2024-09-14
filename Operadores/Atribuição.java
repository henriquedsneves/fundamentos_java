package fundamentos.Operadores;

public class Atribuição {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		 double  c = a + b;
		
		c += b; // c = c + b  
		c -= a; // c = c - a
		c *= a; // c = c * a
		c /=b; //c = c / b
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
		
	}

}
