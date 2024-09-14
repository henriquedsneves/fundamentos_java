package fundamentos.Desafios;

import java.util.Scanner;


public class desafioSalário {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu salário 1: ");
		String salario1 = entrada.nextLine().replace(",", "."); 
		
		// como era uma string eu uso o replace para substituir a vírgula pelo ponto 
	
		System.out.println("digite seu salário 2: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.println("digite seu salário 3: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
	

		
		
		
		
		entrada.close();
		
		
		
		double primeiroSalario = Double.parseDouble(salario1);
		double segundoSalario = Double.parseDouble(salario2);
		double terceiroSalario = Double.parseDouble(salario3);
		double soma = (primeiroSalario + segundoSalario + terceiroSalario);
		
		System.out.printf(" a soma do seu salário é: " + soma + " \n e a média é: " + soma / 3);
	}

}