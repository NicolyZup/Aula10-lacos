//1 - Faça um programa que receba dois números e imprima o maior deles.


        package Lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique qual dos 2 números informados é maior:");
        System.out.println("Informe o 1° número:");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o 2° número:");
        double num2 = entrada.nextDouble();

       if(num1 < num2){
           System.out.println("O número "+ num2 + " é maior que o número " + num1 +".");
       } else {
           System.out.println("O número "+ num1 + " é maior que o número " + num2 +".");
       }
    }
}
