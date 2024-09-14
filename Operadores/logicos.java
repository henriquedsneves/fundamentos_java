package fundamentos.Operadores;



public class logicos {
	
	public static void main(String[] args) {
		boolean condição1 = true;
		boolean condição2 = 3 > 5; 
		System.out.println(condição1 && condição2);
		System.out.println(condição1 || condição2);
		System.out.println(condição1 ^ condição2);
		System.out.println(!condição1);
		
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("Tabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);	
		System.out.println(false || false);
		
		System.out.println("Tabela verdade OU exclusivo (XOR)");
		System.out.println(true  ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("Tabela verdade NOT");
		System.out.println( !true);
		System.out.println(!false);
	
		
	}

}
