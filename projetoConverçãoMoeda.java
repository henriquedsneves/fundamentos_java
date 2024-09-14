package fundamentos;

import java.util.Scanner;

public class projetoConverçãoMoeda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair")) {
        
        System.out.println("Qual a sua moeda atual (USD, EUR, BRL): ");
        String moedaAtual = entrada.next().toUpperCase();

        System.out.println("Quanto você quer converter? ");
        double valorMoedaAtual = entrada.nextDouble();

        System.out.println("Para qual moeda você quer converter (USD, EUR, BRL): ");
        String moedaConvertida = entrada.next().toUpperCase();
        
        

        
        double taxaConversao = "USD".equals(moedaAtual) && "BRL".equals(moedaConvertida) ? 5.47 :
                               "USD".equals(moedaAtual) && "EUR".equals(moedaConvertida) ? 0.92 :
                               "EUR".equals(moedaAtual) && "BRL".equals(moedaConvertida) ? 5.92 :
                               "EUR".equals(moedaAtual) && "USD".equals(moedaConvertida) ? 1.08 :
                               "BRL".equals(moedaAtual) && "USD".equals(moedaConvertida) ? 0.18 :
                               "BRL".equals(moedaAtual) && "EUR".equals(moedaConvertida) ? 0.19 : 0;

        
            double valorConvertido = valorMoedaAtual * taxaConversao;
            System.out.printf("Valor convertido: %.2f %s\n", valorConvertido, moedaConvertida);
        }
            entrada.close();
        }

        
    }

