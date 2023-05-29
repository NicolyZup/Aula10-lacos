//3. Escreva um programa que leia 10 números e escreva o
// menor valor lido é o maior valor lido.

package Lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double menorNum = 1;
        double maiorNum = 0;

        for (int i=1; i <=10;i++){
            System.out.println("Informe o " +i+ "º número:");
            double numInformado = entrada.nextDouble();

            if(numInformado < menorNum){

                menorNum = numInformado;

            } else if (numInformado > maiorNum) {

                maiorNum = numInformado;
            }

        }

        System.out.println("Menor numero: " +menorNum);
        System.out.println("Maior numero: " +maiorNum);

    }
}
