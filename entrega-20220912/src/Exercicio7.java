import java.util.Scanner;

/**
 * 7) Escrever um algoritmo que leia um valor para uma variável N de 1 a 10
 * e calcule a tabuada de
 * N. Mostre a tabuada na forma:
 * 0 x N = 0, 1 x N = 1N, 2 x N = 2N, ..., 10 x N = 10N.
 */

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " x " + n + " = " + (n*i) + ", ");


        }

    }
}
