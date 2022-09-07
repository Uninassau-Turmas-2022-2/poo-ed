import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double valor1, valor2, result;
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();

        if (valor2 == 0){
                System.out.println("ERROR, DIVISÃO POR ZERO NÃO É POSSÍVEL!");
        } else {
            result = valor1/valor2;
            System.out.println("Resultado da divisão é: " + result);
        }

    }
}
