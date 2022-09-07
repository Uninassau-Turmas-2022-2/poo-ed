import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = sc.next();
        System.out.println("Digite sua nota de matemática: ");
        Double notaMatematica = sc.nextDouble();

        if (notaMatematica > 6) {
            System.out.println(name + " você foi aprovado!");
        } else {
            System.out.println(name + " você foi reprovado!");
        }

    }
}
