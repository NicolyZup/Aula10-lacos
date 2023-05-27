// Faça um Programa que receba um número e exiba o dia correspondente
// da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
// aparecer a mensagem “valor inválido”.

package Lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique aqui o dia da semana.");
        System.out.println("Informe um número de 1-7:");
        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Houve um problema, tente novamente.");
        }
    }
}
