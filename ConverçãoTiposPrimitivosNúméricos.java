package fundamentos;

import javax.swing.JOptionPane;

public class ConverçãoTiposPrimitivosNúméricos {
	
	public static void main(String[] args) {
		double a = 1;// converção inplícita
	
		System.out.println(a);
		
		double c = 1.9999;
		int d = (int) c;
		System.out.println(d);
		
		//número para string
		
		Integer num1 = 100; // transformar número para string
		System.out.println(num1.toString()); // para ter mais funcionalidades
		
		int num2 = 999;
		System.out.println(Integer.toString(num2));
		
		//string para número
		String valor1 = JOptionPane.showInputDialog(
				"digite um número:");
		String valor2 = JOptionPane.showInputDialog(
				"digite um outro número:");
		
		double numero1 = Double.parseDouble(valor1) ;
		double número2 = Double.parseDouble(valor2);
		
		double soma = (numero1 + número2);
		
		
		System.out.println("a soma é:" + soma );
		System.out.println("A média é: " + soma/ 2);
				
	}

}