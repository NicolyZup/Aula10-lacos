//2 - Faça um programa que receba o preço de três produtos e informe
// qual produto você deve comprar, sabendo que a decisão é sempre pelo
// mais barato.

package Lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique qual dos 3 produtos você deve comprar!");
        System.out.println("Informe o valor do 1° produto:");
        double produto1 = entrada.nextDouble();

        System.out.println("Informe o valor do 2° produto:");
        double produto2 = entrada.nextDouble();

        System.out.println("Informe o valor do 3° produto:");
        double produto3 = entrada.nextDouble();

        // Tem essa forma sem usar estrutura de decisão
        //double comparacao1 = Math.min(produto1,produto2);
        //double comparacao2 = Math.min(comparacao1,produto3);

        if(produto1 < produto2 && produto1 < produto3){
            System.out.printf("Você deve comprar o 1° produto, cujo valor é R$%.2f", produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.printf("Você deve comprar o 2° produto, cujo valor é R$%.2f", produto2);
        } else {
            System.out.printf("Você deve comprar o 3° produto, cujo valor é R$%.2f", produto3);
        }

    }
}
