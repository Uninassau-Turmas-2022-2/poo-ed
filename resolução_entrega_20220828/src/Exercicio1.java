import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor a ser somado: ");
        Integer A = scanner.nextInt();
        System.out.println("Digite o segundo valor a ser somado: ");
        Integer B = scanner.nextInt();
        // SOMA

        Integer X = A + B;
        System.out.println("X = " + X);
    }
}
