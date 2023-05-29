//9. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

package Lista3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique aqui o fatorial de um número inteiro.");
        System.out.println("Informe o número:");
        int numInformado = entrada.nextInt();

        int calculo = 1;

        for(int i = numInformado; i>1;i --){
            calculo = calculo *i;
        }

        System.out.println("O fatorial do número "+numInformado+" é: "+calculo);
    }
}
