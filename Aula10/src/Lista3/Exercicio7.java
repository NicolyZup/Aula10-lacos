//8. Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.

package Lista3;

public class Exercicio7 {
    public static void main(String[] args) {
        int num = 50;
        int somaImpares =0;

        for(int i = 1; i <= num; i++){
            if(i%2==1){
                somaImpares +=i;
            }
        }

        System.out.println("A soma dos 50 primeiros números ímpares é: "+somaImpares);
    }
}
