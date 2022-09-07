import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double time = Util.scanDouble("Digite a hora: ");

        if (time >= 22.0) {
            System.out.println("Você largou!");
        } else {
            System.out.println("A aula só termina às 22:00!");
        }

    }
}
