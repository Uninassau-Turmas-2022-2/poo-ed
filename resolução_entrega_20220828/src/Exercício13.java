public class Exercício13 {

    public static void main(String[] args) {
        Integer result = Integer.MIN_VALUE;
        Integer A = Util.scanInt("Digite um númedo inteiro:");
        Integer B = Util.scanInt("Digite um númedo inteiro:");
        Integer C = Util.scanInt("Digite um númedo inteiro:");

        if (result < A) {
            result = A;
        }
        if (result < B) {
            result = B;
        }
        if (result < C) {
            result = C;
        }
        System.out.println(result + " eh o maior");
    }
}
