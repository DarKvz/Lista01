package atividade02;

import java.util.Scanner;

public class SistemaEscola {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o nome do(a) professor(a): ");
        String nomeProfessor = scanner.nextLine();

      
        System.out.print("Digite o número de estudantes: ");
        int numeroEstudantes = scanner.nextInt();

       
        scanner.nextLine();

       
        for (int i = 1; i <= numeroEstudantes; i++) {
            System.out.println("\nEstudante " + i + ":");

            
            System.out.print("Digite o nome do estudante: ");
            String nomeEstudante = scanner.nextLine();

           
            System.out.print("Digite a nota 1 do estudante: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a nota 2 do estudante: ");
            double nota2 = scanner.nextDouble();

          
            double media = (nota1 + nota2) / 2;

            
            System.out.println("\nDados do Estudante:");
            System.out.println("Nome: " + nomeEstudante);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Média: " + media);

            scanner.nextLine();
        }

     
        scanner.close();
    }
}
