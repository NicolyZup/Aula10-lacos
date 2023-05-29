//1 - Escreva um programa que escreva na tela,
// de 1 até 100, de 1 em 1, 2 vezes. A primeira
// vez com "for" e a segunda com "while

package Lista3;

public class Exercicio1 {
    public static void main(String[] args) {

        //primeira forma usando "for"

        /*for (int i = 1; i <=100; i++){
            System.out.println(i);
        }*/


        //segunda forma usando "while"
        int contador = 1;

        while (contador <=100){
            System.out.println(contador);
            contador += 1;
        }
    }
}
