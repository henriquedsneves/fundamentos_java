package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		int ajuste = 32;
		double multiplicador = 5.0/9.0;
		int F = 100;
		
		var c = (F - ajuste) * multiplicador;
		System.out.println("são "+ c + " graus celcios" );
	}

}