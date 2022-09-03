import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor a ser multiplicado: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o segundo valor a ser multiplicado: ");
        Integer B = scanner.nextInt();

        Integer SOMA = A * B;
        System.out.println("PROD = " + SOMA);
    }
}
