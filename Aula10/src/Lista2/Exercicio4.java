//4 - Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores
// e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto,
// faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
// critério, baseado no salário atual:
//Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//Salários de R$ 1500,00 em diante, receberão aumento de 5%
//Após o aumento ser realizado, informe na tela:
//O salário antes do reajuste;
//O percentual de aumento aplicado;
//O valor do aumento;
//O novo salário, após o aumento

package Lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Verifique aqui quanto será o reajuste do seu salário!");
        System.out.println("Informe seu salário:");
        double salario = entrada.nextDouble();

        double aumento = 0;
        double salarioFinal =0;
        int porcentagem = 0;

        if(salario <= 280){

            aumento  += salario * 20/100;
            salarioFinal += salario + aumento;
            porcentagem = 20;

        } else if (salario > 280 && salario < 700) {

            aumento += salario * 15/100;
            salarioFinal += salario + aumento;
            porcentagem = 15;

        } else if (salario > 700 && salario < 1500) {

            aumento += salario * 10/100;
            salarioFinal += salario + aumento;
            porcentagem = 10;

        } else {

            aumento += salario * 5/100;
            salarioFinal += salario + aumento;
            porcentagem = 5;

        }

        System.out.println("Segue dados sobre seu reajuste salarial:");
        System.out.println("---------------------------------------");
        System.out.printf("Salário anterior: R$%.2f \r\n", salario);
        System.out.println("Porcentual de ajuste: "+ porcentagem+"%");
        System.out.printf("Valor do aumento: R$%.2f \r\n", aumento);
        System.out.printf("Salário atual: R$%.2f \r\n", salarioFinal);
    }
}
