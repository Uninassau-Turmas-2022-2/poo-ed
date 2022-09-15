import java.util.Scanner;

/**
 * 10) Escreva um algoritmo que leia um valor inicial A e
 * imprima a seqüência de valores do cálculo de
 * A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120
 */

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = sc.nextInt();
        for (int i = a-1; i >=1 ; i--) {
            a*=i;
        }
        System.out.print(a);
    }
}
