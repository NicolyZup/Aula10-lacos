//5 - Faça um programa para zerar a fila de um banco.

package Lista1;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas pessoas há na fila?");
        int fila = entrada.nextInt();

        for(int i = fila; i>=1;i--){

            System.out.println(i);
        }

        System.out.println("Fila vazia :)");
    }
}
