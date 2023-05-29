//4. Faça um programa que leia n números positivos e calcule a soma desses números.

package Lista3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique a soma dos números.");
        System.out.println("Informe aqui a quantidade de números que serão informados para a soma:");
        int qtdNumeros = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i <= qtdNumeros; i++){
            System.out.println("Informe o "+i+"° número:");
            double numInformado = entrada.nextDouble();

           if (numInformado>0){
               soma += numInformado;
           } else {
               System.out.println("O número informado não pode ser menor que 0. Tente novamente.");
               i = 10;
           }

            System.out.println("A soma dos números informados é: " + soma);
        }


    }
}
