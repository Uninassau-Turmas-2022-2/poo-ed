public class Exercicio10 {

    public static void main(String[] args) {
        Integer pc1 = Util.scanInt("Digite o número da peça 1: ");
        Integer qtdPc1 = Util.scanInt("Digite a quantidade de peças 1 que você quer comprar: ");
        Double valorPc1 = Util.scanDouble("Digite o valor da peça 1: ");

        Integer pc2 = Util.scanInt("Digite o número da peça 2: ");
        Integer qtdPc2 = Util.scanInt("Digite a quantidade de peças 2 que você quer comprar: ");
        Double valorPc2 = Util.scanDouble("Digite o valor da peça 2: ");

        System.out.println("VALOR A PAGAR: R$ " + ((qtdPc1 * valorPc1) + (qtdPc2 * valorPc2)));
    }

}
