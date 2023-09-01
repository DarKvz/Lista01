package atividade03;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMesa;
        String[][] pedidos = new String[3][3]; 
        double valorTotal = 0.0;

       
        System.out.print("Digite o numero da mesa do bar: ");
        numeroMesa = scanner.nextInt();

      
        scanner.nextLine();

     
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPedido " + (i + 1) + ":");

           
            System.out.print("Digite o nome da bebida ou refeicao: ");
            String nomeProduto = scanner.nextLine();

           
            System.out.print("Digite o valor da bebida ou refeicao: ");
            double valorProduto = scanner.nextDouble();

            
            System.out.print("Digite a quantidade de bebidas ou refeicoes: ");
            int quantidade = scanner.nextInt();

           
            double valorPedido = valorProduto * quantidade;
            valorTotal += valorPedido;

            
            pedidos[i][0] = nomeProduto;
            pedidos[i][1] = Double.toString(valorProduto);
            pedidos[i][2] = Integer.toString(quantidade);

           
            scanner.nextLine();
        }

        System.out.println("\nResumo dos Pedidos (Mesa " + numeroMesa + "):");
        for (int i = 0; i < 3; i++) {
            System.out.println("Produto: " + pedidos[i][0]);
            System.out.println("Valor Unitario: R$" + pedidos[i][1]);
            System.out.println("Quantidade: " + pedidos[i][2]);
            System.out.println("Subtotal: R$" + (Double.parseDouble(pedidos[i][1]) * Integer.parseInt(pedidos[i][2])));
            System.out.println();
        }

        System.out.println("Valor Total da Conta: R$" + valorTotal);

        
        scanner.close();
    }
}

