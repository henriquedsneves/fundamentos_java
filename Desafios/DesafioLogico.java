package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioLogico {
		public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Você consegui fazer o seu primeiro trabalho?\n Se sim digite true, se não digite false: ");
			boolean trabalho1 = entrada.nextBoolean();
		
		 System.out.println("Você consegui fazer o seu segundo trabalho?\n  Se sim digite true, se não digite false: ");
			boolean trabalho2 = entrada.nextBoolean();
			
			
		
		boolean comprouTV50 = (trabalho1 && trabalho2);
		boolean  comprouTV32 = (trabalho1 ^ trabalho2);
		boolean comeusorvete = (trabalho1 || trabalho2);
		boolean maisSaudavel = !comeusorvete;
		
		
		System.out.println("Comprou TV de 50 ? " + comprouTV50);
		System.out.println("A familia toda vai comprar sorvete ? " + comeusorvete );
		System.out.println("Comprou uma TV de 32 polegadas ? " + comprouTV32);
		System.out.println(" Você está mais saudável ? " + maisSaudavel);
		entrada.close();

		
	}
	

}
