import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double A = null;
        while (A == null || A < 0 || A > 10){
            System.out.println("Digite o primeiro valor: ");
            A = scanner.nextDouble();
        }
        Double B = null;
        while (B == null || B < 0 || B > 10){
            System.out.println("Digite o segundo valor: ");
            B = scanner.nextDouble();
        }


        Double MEDIA = (A*3.5 + B*7.5)/11;
        System.out.printf("A=%.5f\n", MEDIA);
    }
}
