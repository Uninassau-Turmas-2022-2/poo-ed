import java.util.Scanner;

/**
 * 4) Escrever um algoritmo que leia
 * uma quantidade desconhecida de números e conte quantos deles
 * estão nos seguintes intervalos: [0-25],
 * [26-50], [51-75] e [76-100]. A entrada de dados deve
 * terminar quando for lido um número negativo.
 */

public class Exercicio4 {
    public static void main(String[] args) {
        int i0_25 = 0, i26_50 = 0, i51_75 = 0, i76_100 = 0;
        Integer n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um número entre 0 e 100: ");
            n = sc.nextInt();
            if (n >= 0 && n <= 25) {
                i0_25++;
            } else if (n >= 26 && n <= 50) {
                i26_50++;
            } else if (n >= 51 && n <= 75) {
                i51_75++;
            } else if (n >= 76 && n <= 100) {
                i76_100++;
            } else if (n > 100) {
                System.out.println("O número deve estar entre 0 e 100!");
            }
        } while (n >= 0);

        System.out.println(i0_25 + " - " + i26_50 + " - " + i51_75 + " - " + i76_100);
    }
}
