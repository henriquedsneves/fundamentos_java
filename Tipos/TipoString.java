package fundamentos.Tipos;

public class TipoString {

		
		public static void main(String[] args) {
			
			
			System.out.println("olá pessoal".charAt(2));
			String s = ("boa tarde");
			System.out.println(s.concat("!!!!!"));
			System.out.println(s + "!!!!!");
			System.out.println(s.startsWith("boa"));
			System.out.println(s.toLowerCase().startsWith("boa"));
			System.out.println(s.toUpperCase().endsWith("TARDE"));
			System.out.println(s.length());
			System.out.println(s.toLowerCase().equals("boa tarde"));
			System.out.println(s.equalsIgnoreCase("boa tarde"));
			
			var nome = ("Henrique");
			var sobrenome = ("sousa");
			var idade = (15);
			var salário = (1446.99);
			
			System.out.println("Nome: " + nome + 
					" \n Sobenome" + sobrenome + 
					" \n Idade: " + idade + 
					" \nSalário: " + salário);
			
			System.out.printf("O senhor %s %s tem %d anos e recebe R$ %.2f"
					, nome, sobrenome, idade, salário);
			System.out.println("frase qualquer".contains("qual"));
			System.out.println("frase qualquer".indexOf("qual"));
			System.out.println("frase qualquer".substring(6));
			System.out.println("frase qualquer".substring(6, 10));
			
			
		}

	}


