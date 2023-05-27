//3 - Faça um programa que receba duas notas parciais de um aluno. O programa
// deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

package Lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique aqui sua média de duas notas parciais.");
        System.out.println("Informe sua 1ª nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Informe sua 2ª nota:");
        double nota2 = entrada.nextDouble();

        double media = (nota1+nota2) / 2;

        if(media == 10){
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media <7) {
            System.out.println("Reprovado!");
        }
    }
}
