import java.util.Scanner;

/**
 * 5) Faça um algoritmo estruturado que leia uma quantidade
 * não determinada de números positivos.
 * Calcule a quantidade de números pares e ímpares,
 * a média de valores pares e a média geral dos
 * números lidos. O número que encerrará a leitura será zero.
 */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n, nP =0, nI=0, somaP=0, somaTotal=0;
        do {
            System.out.println("Digite um número: ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                nP ++;
                somaP += n;
            } else {
                nI ++;
            }
            somaTotal += n;
        } while (n != 0);

        System.out.println("Qtd nP: " + nP);
        System.out.println("Qyd nI: " + nI);
        System.out.println("Média nP: " + (somaP/nP));
        System.out.println("Média total: " + (somaTotal/(nP + nI)));
    }



}
