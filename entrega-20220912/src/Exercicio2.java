import java.util.Scanner;

/**
 2) Desenvolver um algoritmo que leia a altura de 15 pessoas.
 Este programa deverá calcular e
 mostrar :
 a. A menor altura do grupo;
 b. A maior altura do grupo;
 */

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite sua altura: ");
            Double altura = sc.nextDouble();
            if (maior < altura) {
                maior = altura;
            }

            if (menor > altura){
                menor = altura;
            }


        }
        System.out.println("A maior altura do grupo e: " + maior);
        System.out.println("A menor altura do grupo e: " + menor);

    }
}
