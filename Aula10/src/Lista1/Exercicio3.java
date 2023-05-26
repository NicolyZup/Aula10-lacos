//3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses números.

package Lista1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe 5 números para verificar a soma deles.");
        System.out.println("Informe o 1° número:");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o 2° número:");
        double num2 = entrada.nextDouble();

        System.out.println("Informe o 3° número:");
        double num3 = entrada.nextDouble();

        System.out.println("Informe o 4° número:");
        double num4 = entrada.nextDouble();

        System.out.println("Informe o 5° número:");
        double num5 = entrada.nextDouble();

        double soma = 0;


        for(int i = 5; i>=1;i--){
            switch (i){
                case 5:
                    soma += num1;
                    break;
                case 4:
                    soma += num2;
                    break;
                case 3:
                    soma += num3;
                    break;
                case 2:
                    soma += num4;
                    break;
                case 1:
                    soma += num5;
                    break;
                default:
                    System.out.println("Deu errado.");
            }
        }

        System.out.println("A soma dos números é: "+soma);
    }
}
