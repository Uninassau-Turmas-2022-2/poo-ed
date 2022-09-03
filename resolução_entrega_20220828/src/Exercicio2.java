import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio da circuferência: ");
        Double raio = scanner.nextDouble();

        Double area = pi * Math.pow(raio, 2);
        System.out.printf("A=%.2f\n", area);
    }
}
