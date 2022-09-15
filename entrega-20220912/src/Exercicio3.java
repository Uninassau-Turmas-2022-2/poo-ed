import java.util.Scanner;

/**
 * 3) Desenvolver um algoritmo que leia um número não
 * determinado de valores e calcule e escreva a
 * média aritmética dos valores lidos, a quantidade de
 * valores positivos, a quantidade de valores
 * negativos e o percentual de valores negativos e positivos.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;
        double mediaAr = 0, qtdP = 0, qtdN = 0;
        double percentP, percentN, soma = 0;
        do {
            System.out.println("Digite um n: ");
            double n = sc.nextDouble();
            soma += n;
            if (n >= 0) {
                qtdP++;
            } else {
                qtdN++;
            }
            System.out.println("quer encerrar o programa? se sim (S) se nao (N)");
            exit = sc.next();
        } while (!exit.toUpperCase().equals("S"));

        mediaAr = soma / (qtdN + qtdP);
        percentP = qtdP / (qtdP + qtdN);
        percentN = qtdN / (qtdP + qtdN);
        System.out.println(" a media aritimetica 'e :" + mediaAr);
        System.out.println(" a qtd n positivos :" + qtdP);
        System.out.println(" a qtd n negativos :" + qtdN);
        System.out.println(" o percentual de n positivos:" + percentP);
        System.out.println(" o percentual de n negativos:" + percentN);
    }
}
