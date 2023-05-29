//7. Faça um programa que peça um número inteiro e determine se
// ele é ou não um número primo. Um número primo é aquele que é
// divisível somente por ele mesmo e por 1.

package Lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro para verificar se ele é primo ou não:");
        int numInformado = entrada.nextInt();


        if(numInformado%2==1){
            System.out.println("O número " + numInformado + " é um número primo.");
        } else {
            System.out.println("O número " + numInformado + " não é um número primo.");
        }

    }
}
