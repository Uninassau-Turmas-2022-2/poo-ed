import java.util.Scanner;

/**
 * 8) Escreva um algoritmo que leia um valor inicial A e uma razão
 * R e imprima uma seqüência em
 * P.A. contendo 10 valores.
 */

public class Exercicio8 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double a=sc.nextDouble();
    double r=sc.nextDouble();
    double result= a;

        for (int i = 0; i <10 ; i++) {
         System.out.println(result);
         result += r;


        }

    }
}
