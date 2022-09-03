public class Exercício15 {

    public static void main(String[] args) {
        Double x1 = Util.scanDouble("Digite o valor x1: ");
        Double y1 = Util.scanDouble("Digite o valor y1: ");
        Double x2 = Util.scanDouble("Digite o valor x2: ");
        Double y2 = Util.scanDouble("Digite o valor y1: ");

        System.out.printf("%.4f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
