package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("escolha o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("escolha a operação: ");
		String operação = entrada.next(); 
		
		System.out.println("escolha o  outro número: ");
		double num2 = entrada.nextDouble();
		
	
		
		double resultado = "+".equals(operação) ?  num1 + num2 : 0;
		 resultado =  "-".equals(operação) ?  num1 - num2 : resultado;
		 resultado = "*".equals(operação) ?  num1 * num2 : resultado;
		 resultado = "/".equals(operação) ?  num1 / num2 : resultado;
		 resultado = "%".equals(operação) ?  num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f, \né igual a %.2f"
				, num1, operação, num2, resultado);

		
		entrada.close();
	}

}
