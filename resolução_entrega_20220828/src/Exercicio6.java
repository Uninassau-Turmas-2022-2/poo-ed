import java.util.Scanner;

public class Exercicio6 {
    public static Double scan(String numeral) {
        Double result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null || result < 0 || result > 10) {
            System.out.println("Digite a " + numeral + " nota:");
            result = scan.nextDouble();
        }
        return result;
    }

    public static Double mediaPonderada(
            Double nota1, Double peso1,
            Double nota2, Double peso2,
            Double nota3, Double peso3
    ) {
        Double result =
                (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)
                        / (peso1 + peso2 + peso3);
        return result;
    }

    public static void main(String[] args) {
        Double A = scan("primeira");
        Double B = scan("segunda");
        Double C = scan("terceira");
        Double mediaPonderada = mediaPonderada(
                A, 2.0, B, 3.0, C, 5.0);
        System.out.printf("MEDIA = %.1f\n", mediaPonderada);
    }
}
