//4 - Escreva, usando while, um programa para
// calcular a média de N números. O valor de N é dado pelo usuário.

package Lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");
        int numeroMedia = entrada.nextInt();
        int contador = 0;
        double notas = 0;

        while (contador < numeroMedia){
            System.out.println("Digite os números:");
            double numerosInformados = entrada.nextDouble();
            notas += numerosInformados;
            contador += 1;
        }

        double media = notas/numeroMedia;
        System.out.println("A soma dos números informados é: "+notas);
        System.out.println("A média dos números informados é: "+media);
    }
}
