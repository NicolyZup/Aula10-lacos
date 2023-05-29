//2. Faça um programa que leia n números inteiros e imprima sua média.

package Lista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique aqui a média dos números informados.");
        System.out.println("Informe a quantidade de números serão utilizados:");
        int numeroMedia = entrada.nextInt();
        int contador = 0;
        double notas = 0;

        for(contador=0;contador <numeroMedia; contador++){
            System.out.println("Digite os números:");
            double numerosInformados = entrada.nextDouble();
            notas += numerosInformados;
        }

        double media = notas/numeroMedia;

        System.out.println("A média dos números informados é: " + media);
    }
}
