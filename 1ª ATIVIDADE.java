package TESTE;

import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo do Cliente: ");
        String nomeCompleto = scanner.nextLine();

      
        System.out.print("Digite o primeiro valor inteiro: ");
        int primeiroValor = scanner.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int segundoValor = scanner.nextInt();

     
        double divisao = (double) primeiroValor / segundoValor;

  
        System.out.println("Nome completo do Cliente: " + nomeCompleto);
        System.out.println("Primeiro valor: " + primeiroValor);
        System.out.println("Segundo valor: " + segundoValor);
        System.out.println("Resultado da divisao: " + divisao);

        
        scanner.close();
    }
}
