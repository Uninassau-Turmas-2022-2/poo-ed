import java.util.Scanner;

public class Exercicio7 {

    public static Integer scanInt(String numeral){
        Integer result = null;
        Scanner scan = new Scanner(System.in);
        while (result == null || result < 0 || result > 10) {
            System.out.println("Digite o " + numeral + " numero:");
            result = scan.nextInt();
        }
        return result;
    }

    public static void main(String[] args) {
        Integer A = scanInt("primeiro");
        Integer B = scanInt("segundo");
        Integer C = scanInt("terceiro");
        Integer D = scanInt("quarto");

        System.out.print("DIFERENÇA = " + (A * B - C * D));

    }
}
