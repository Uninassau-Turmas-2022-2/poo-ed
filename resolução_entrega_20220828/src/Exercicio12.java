public class Exercicio12 {

    public static void main(String[] args) {
        Double A = Util.scanDouble("Digite o valor de A: ");
        Double B = Util.scanDouble("Digite o valor de B: ");
        Double C = Util.scanDouble("Digite o valor de C: ");

        System.out.printf("TRIÂNGULO: %.3f\n", ((A * C) / 2));
        System.out.printf("CÍCULO: %.3f\n", (Math.PI * Math.pow(C, 2)));
        System.out.printf("TRAPÉZIO: %.3f\n", (((A + B) * C) / 2));
        System.out.printf("QUADRADO: %.3f\n", (B * B));
        System.out.printf("RETÂNGULO: %.3f\n", (A * B));
    }

}
