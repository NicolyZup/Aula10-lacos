//6. Faça um programa que some os números ímpares contidos
// em um intervalo definido pelo usuário. O usuário define
// o valor inicial do intervalo e o valor final deste intervalo
// e o programa deve somar todos os números ímpares contidos neste
// intervalo. Caso o usuário digite um intervalo inválido (começando
// por um valor maior que o valor final) deve ser escrito uma mensagem
// de erro na tela, “Intervalo de valores inválido” e o programa termina.

package Lista3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Some aqui os números ímpares de um determinado intervalo.");
        System.out.println("Informe o valor inicial do intervalo:");
        int valorInicial = entrada.nextInt();

        System.out.println("Informe o valor final do intervalo:");
        int valorFinal = entrada.nextInt();

        int somaImpares = 0;

        if(valorInicial>valorFinal){

            System.out.println("Intervalo de valores inválido, tente novamente.");

        } else {

            for(int i = valorInicial; i <= valorFinal; i++){
                if(i%2==1){
                    somaImpares+=i;
                }
            }

            System.out.println("A soma dos números impares do intervalo informado é: "+somaImpares);
        }


    }
}
